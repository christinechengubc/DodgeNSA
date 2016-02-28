package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.DodgeNSA;
import com.mygdx.game.sprites.Obstacle;
import com.mygdx.game.sprites.Person;
import com.mygdx.game.sprites.iPhone;
import com.mygdx.game.states.State;

import java.util.Random;

/**
 * Created by owner on 27/02/2016.
 */
public class PlayState extends State {
    private Person person;
    private Obstacle obstacle;
    private iPhone iPhone;
    private Texture bg;
    public int points;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        person = new Person(0, 0);
        obstacle = new Obstacle();
//        cam.setToOrtho(false, DodgeNSA.WIDTH / 2, DodgeNSA.HEIGHT / 2);
        iPhone = new iPhone();
        bg = new Texture("bg.jpg");
        points = 0;
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched())
            person.jump();
    }

    @Override
    public void update(float dt) {
        handleInput();
        person.update(dt);
        obstacle.update(dt);
        iPhone.update(dt);
        if (obstacle.collides(person.getBounds())) {
            gsm.set(new GameOverState(gsm));
        }

        if (iPhone.collides(person.getBounds())) {
            iPhone.noNSA();
            points += 1;
        }
    }

    @Override
    public void render(SpriteBatch sb) {
//        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth) / 2, 0);
        sb.draw(person.getPerson(), person.getPosition().x, person.getPosition().y);
        sb.draw(obstacle.getObstacle(), obstacle.getPosition().x, obstacle.getPosition().y);
        sb.draw(iPhone.getiPhone(), iPhone.getPosition().x, iPhone.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }

    public int getPoints() {
        return points;
    }
}
