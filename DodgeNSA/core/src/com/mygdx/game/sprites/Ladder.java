package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;

import java.util.Random;

public class Ladder{
    private Vector2 position;
    private Texture ladder;

    public Ladder(int x, int y) {
        ladder = new Texture("ladder.png");
        position = new Vector2(x, y);
    }

    public void update(float dt) {
    }

    public Texture getLadder() {
        return ladder;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void dispose() {
        ladder.dispose();
    }
}