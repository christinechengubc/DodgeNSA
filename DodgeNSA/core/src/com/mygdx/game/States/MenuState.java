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
    private int highScore;

    public MenuState(GameStateManager gsm, int highScore) {
        super(gsm);
        background = new Texture("bg.jpg");
<<<<<<< Updated upstream
        playBtn = new Texture("playBtn.png");
        this.highScore = highScore;
=======
        playBtn = new Texture("playbtn.png");
>>>>>>> Stashed changes
        bf = new BitmapFont();
        story = "                     In 2016, the NSA has bugged all iPhones. \n" +
                "\n" +
                "\n" +
                "    Tim Cook has to use Private Internet Access to save iPhones. \n" +
                "\n" +
                "\n" +
                "                           Avoid bugs and collect iPhones.";

    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm, highScore));
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
        bf.draw(sb, story, (DodgeNSA.WIDTH /2) - (playBtn.getWidth()/2) - 140, DodgeNSA.HEIGHT / 2);
        sb.draw(playBtn, (DodgeNSA.WIDTH /2) - (playBtn.getWidth()/2), DodgeNSA.HEIGHT / 10);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
