package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.mygdx.game.DodgeNSA;

import java.util.Random;

public class Ladder{
    //    public static final int FLUCTUATION = 130;
//    public static final int OBSTACLE_GAP = 100;
//    public static final int LOWEST_OPENING = 120;
//    private Texture topObstacle, bottomObstacle;
//    private Vector2 posTopObstacle, posBotObstacle;
    private Vector2 position;
    private Texture ladder;

    public Ladder(int x, int y) {
        ladder = new Texture("ladder.gif");
        position = new Vector2(x, y);

//        topObstacle = new Texture("topObstacle.png");
//        bottomObstacle = new Texture("bottomObstacle.png");
//        rand = new Random();
//
//        posTopObstacle = new Vector2(x, rand.nextInt(FLUCTUATION) + OBSTACLE_GAP + LOWEST_OPENING);
//        posBotObstacle = new Vector2(x, posBotObstacle.y - OBSTACLE_GAP - bottomObstacle.getHeight());
    }

    public void update(float dt) {
    }

    public Texture getLadder() {
        return ladder;
    }

    public Vector2 getPosition() {
        return position;
    }
}