package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.DodgeNSA;
import com.mygdx.game.sprites.Person;
import com.mygdx.game.states.State;

/**
 * Created by owner on 27/02/2016.
 */
public class PlayState extends State {
    private Person person;
    private Texture bg;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        person = new Person(50, 100);
        cam.setToOrtho(false, DodgeNSA.WIDTH / 2, DodgeNSA.HEIGHT / 2);
        bg = new Texture("bg.png");
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
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, cam.position.x - (cam.viewportWidth) / 2, 0);
        sb.draw(person.getPerson(), person.getPosition().x, person.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
