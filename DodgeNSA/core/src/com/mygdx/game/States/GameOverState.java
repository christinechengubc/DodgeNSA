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
    private String score;
    private String highScoreString;
    private int highScore;
    private BitmapFont bf;

    public GameOverState(GameStateManager gsm, int score, int highScore) {
        super(gsm);
        bg = new Texture("bg2.jpg");
        this.score = "Your Score: " + score;
        this.highScoreString = "High Score: " + highScore;
        this.highScore = highScore;
        bf = new BitmapFont();
        bf.getData().setScale(2, 2);
    }

    @Override
    protected void handleInput() {
        if (Gdx.input.justTouched()) {
            gsm.set(new MenuState(gsm, highScore));
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
        bf.setColor(255, 255, 255, 255);
        bf.draw(sb, score, DodgeNSA.WIDTH / 2, DodgeNSA.HEIGHT / 4);
        bf.draw(sb, highScoreString, DodgeNSA.WIDTH / 2, DodgeNSA.HEIGHT / 6);
        sb.end();

    }

    @Override
    public void dispose() {
        bg.dispose();
    }
}
