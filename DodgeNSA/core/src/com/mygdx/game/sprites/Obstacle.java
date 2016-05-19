package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;

import java.util.Random;

public class Obstacle {
    private Random rand;
    private static final int GRAVITY = -1;
    private Vector2 position;
    private Vector2 velocity;
    private Texture obstacle;
    private Rectangle bounds;

    public Obstacle(){
        obstacle = new Texture("obstacle.png");
        rand = new Random();
        position = new Vector2(randInt(150, 330), rand.nextInt(DodgeNSA.HEIGHT+200)+DodgeNSA.HEIGHT);
        velocity = new Vector2(0,0);
        bounds = new Rectangle(position.x,position.y,obstacle.getWidth(),obstacle.getHeight());
    }

    public void update(float dt) {
        velocity.add(0,GRAVITY);
        velocity.scl(dt);
        position.add(0,velocity.y);
        velocity.scl(1/dt);
        bounds.setPosition(position.x,position.y);
    }

    public boolean collides(Rectangle player) {
        return player.overlaps(bounds);
    }

    public Texture getObstacle() {
        return obstacle;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public void resetObject(){
        obstacle = new Texture("obstacle.png");
        rand = new Random();
        position = new Vector2(randInt(150, 330), rand.nextInt(DodgeNSA.HEIGHT+200)+DodgeNSA.HEIGHT);
        velocity = new Vector2(0,0);
        bounds = new Rectangle(position.x,position.y,obstacle.getWidth(),obstacle.getHeight());
    }

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void dispose() {
        obstacle.dispose();
    }

}
