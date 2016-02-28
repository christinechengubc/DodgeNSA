package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;

public class Person {
    private static final int GRAVITY = -15;

    private Vector3 position;
    private Vector3 velocity;

    private Texture person;

    public Person(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0,0,0);
        person = new Texture("person.png");
    }

    public void update(float dt){


      if(position.y > 0){
            velocity.add(0, GRAVITY, 0);
        }
        velocity.scl(dt);
        position.add(velocity.x, 0, 0);
        velocity.scl(1/dt);
        if(position.y < 0){
            position.y = 0;
        }
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getPerson() {
        return person;
    }

    public void jump(){
        if(position.x > DodgeNSA.WIDTH/2)
            velocity.x = 250;
        else
            velocity.x = -250;
    }
}
