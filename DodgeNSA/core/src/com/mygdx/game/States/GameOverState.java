package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.DodgeNSA;


/**
 * Created by owner on 27/02/2016.
 */
public class GameOverState extends State {
    private Texture bg;

    public GameOverState(GameStateManager gsm) {
        super(gsm);
        bg = new Texture("bg2.jpg");
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new MenuState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(bg, 0, 0, DodgeNSA.WIDTH, DodgeNSA.HEIGHT);
        sb.end();

    }

    @Override
    public void dispose() {
        bg.dispose();
    }
}
