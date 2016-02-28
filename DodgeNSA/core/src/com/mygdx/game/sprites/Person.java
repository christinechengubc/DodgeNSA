package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;

public class Person {
    private static final int UPDOWN = 15;

    private Vector3 position;
    private Vector3 velocity;
    private boolean jumpLeft;

    private Texture person;
    private Rectangle bounds;

    public Person(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0,0,0);
        person = new Texture("person.png");
        jumpLeft = false;
        bounds = new Rectangle(x,y,person.getWidth(),person.getHeight());
    }

    public void update(float dt){
      if(position.y > 0){
          //if(position.x == 0 || position.x == DodgeNSA.WIDTH - person.getWidth())
              velocity.add(0, -UPDOWN, 0);
          //else
            //  velocity.y = 0;

      }
        position.add(0, velocity.y, 0);
        velocity.scl(dt);
        position.add(velocity.x, 0, 0);
        velocity.scl(1/dt);

        if(position.y < DodgeNSA.HEIGHT - person.getHeight()){
            //if(position.x == 0 || position.x == DodgeNSA.WIDTH - person.getWidth())
                velocity.add(0, UPDOWN, 0);
            //else
             //   velocity.y = 0;
        }

       // if(position.y < 0) {
        //    velocity.add(0, UPDOWN, 0);
       // }

        if(position.x < 0) {
            position.x = 0;
        }

        if(position.x > DodgeNSA.WIDTH - person.getWidth()) {
            position.x = DodgeNSA.WIDTH - person.getWidth();
        }
        bounds.setPosition(position.x, position.y);
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getPerson() {
        return person;
    }

    public void jump(){
        if(jumpLeft) {
            velocity.x = -300;
            velocity.y = 0;
        }
        else {
            velocity.x = 300;
            velocity.y = 0;
        }


        jumpLeft = !jumpLeft;
    }
}
