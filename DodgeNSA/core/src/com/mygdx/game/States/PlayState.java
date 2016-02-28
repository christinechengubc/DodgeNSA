package com.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.states.State;

/**
 * Created by owner on 27/02/2016.
 */
public class PlayState extends State {
    private Texture person;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        person = new Texture("person.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(person, 50, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
