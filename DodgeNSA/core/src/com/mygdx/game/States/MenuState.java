package com.mygdx.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.DodgeNSA;

/**
 * Created by pacolee on 16-02-27.
 */
public class MenuState extends State {
    private Texture background;
    private Texture playBtn;
    private String story;
    BitmapFont bf;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.jpg");
        playBtn = new Texture("playBtn.png");
        bf = new BitmapFont();
        story = "In 2016, the NSA has bugged all iPhones \n" +
                "\n" +
                "\n" +
                "Tim Cook has to use Private Internet Access to save all the iPhones \n" +
                "\n" +
                "\n" +
                "Avoid all the bugs and collect all the iPhones.";
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
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
        sb.draw(background, 0, 0, DodgeNSA.WIDTH, DodgeNSA.HEIGHT);
        sb.draw(playBtn, (DodgeNSA.WIDTH / 2) - (playBtn.getWidth() / 2), DodgeNSA.HEIGHT / 2);
        bf.getData().setScale((float)1, (float)1);
        bf.draw(sb, story, (DodgeNSA.WIDTH /2) - (playBtn.getWidth()/2) - 160, DodgeNSA.HEIGHT / 2);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
