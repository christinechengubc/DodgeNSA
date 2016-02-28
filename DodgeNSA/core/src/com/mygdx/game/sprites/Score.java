package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;
import com.mygdx.game.states.GameOverState;
import com.mygdx.game.states.GameStateManager;

public class Score {
    private static final int UPDOWN = 15;

    private Vector3 position;
    private int score_value;
    private String score;
    BitmapFont font = new BitmapFont();


    public Score(){
        position = new Vector3(DodgeNSA.WIDTH/2, DodgeNSA.HEIGHT/2, 0);
        score_value = 0;
        score = "score: 0";
        font = new BitmapFont();
    }

    public void update(float dt){
        if
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

}
