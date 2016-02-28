package com.mygdx.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.DodgeNSA;

/**
 * Created by pacolee on 16-02-27.
 */
public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.jpg");
        playBtn = new Texture("playBtn.jpg");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, DodgeNSA.WIDTH, DodgeNSA.HEIGHT);
        sb.draw(playBtn, (DodgeNSA.WIDTH /2) - (playBtn.getWidth()/2), DodgeNSA.HEIGHT / 2);
        sb.end();

    }
}
