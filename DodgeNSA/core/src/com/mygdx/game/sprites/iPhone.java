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
    private static final int GRAVITY = -15;
    private Vector2 position;
    private Vector2 velocity;
    private Texture iPhone;
    private Rectangle bounds;

    public iPhone() {
        iPhone = new Texture("iPhone.png");
        rand = new Random();
        position = new Vector2(rand.nextInt(DodgeNSA.WIDTH), DodgeNSA.HEIGHT);
        velocity = new Vector2(0,0);
        bounds = new Rectangle(position.x,position.y,iPhone.getWidth(),iPhone.getHeight());

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
;    }

    public boolean collides(Rectangle player) {
        return player.overlaps(bounds);
    }

    public Texture getiPhone() {
        return iPhone;
    }

    public Vector2 getPosition() {
        return position;
    }

}
