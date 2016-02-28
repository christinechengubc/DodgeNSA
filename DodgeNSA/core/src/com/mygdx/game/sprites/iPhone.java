package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.DodgeNSA;
import java.util.Random;

/**
 * Created by pacolee on 16-02-27.
 */
public class iPhone {
    private Random rand;
    private static final int GRAVITY = -1;
    private Vector2 position;
    private Vector2 velocity;
    private Texture iPhone;
    private Rectangle bounds;
    private boolean collided;

    public iPhone() {
        iPhone = new Texture("iPhone.png");
        rand = new Random();
        this.position = new Vector2(randInt(150, 330), rand.nextInt(DodgeNSA.HEIGHT + 200) + (DodgeNSA.HEIGHT));
        velocity = new Vector2(0,0);
        bounds = new Rectangle(position.x,position.y,iPhone.getWidth() + 10,iPhone.getHeight() + 10);
        collided = false;
    }

    public void update(float dt) {
        velocity.add(0,GRAVITY);
        velocity.scl(dt);
        position.add(0,velocity.y);
        velocity.scl(1/dt);
        bounds.setPosition(position.x,position.y);
    }

    public void noNSA() {
        iPhone = new Texture("stop.png");
    }

    public void resetObject(){
        this.iPhone = new Texture("iPhone.png");
        rand = new Random();
        this.position = new Vector2(randInt(150, 330), rand.nextInt(DodgeNSA.HEIGHT + 200) + (DodgeNSA.HEIGHT));
        this.velocity = new Vector2(0,0);
        this.bounds = new Rectangle(position.x,position.y,iPhone.getWidth() + 10,iPhone.getHeight() + 10);
        this.collided = false;
    }

    public boolean collides(Rectangle player) {
        return player.overlaps(bounds);
    }

    public Texture getiPhone() {
        return iPhone;
    }

    public Vector2 getPosition() {
        return position;
    }

    public boolean getCollided() {
        return collided;
    }

    public void setCollided(boolean collided) {
        this.collided = collided;
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
        iPhone.dispose();
    }

}
