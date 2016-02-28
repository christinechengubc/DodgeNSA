package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Obstacle {
    public static final int FLUCTUATION = 130;
    public static final int OBSTACLE_GAP = 100;
    public static final int LOWEST_OPENING = 120;
    private Texture topObstacle, bottomObstacle;
    private Vector2 posTopObstacle, posBotObstacle;
    private Random rand;

    public Obstacle(float x){
        topObstacle = new Texture("topObstacle.png");
        bottomObstacle = new Texture("bottomObstacle.png");
        rand = new Random();

        posTopObstacle = new Vector2(x, rand.nextInt(FLUCTUATION) + OBSTACLE_GAP + LOWEST_OPENING);
        posBotObstacle = new Vector2(x, posBotObstacle.y - OBSTACLE_GAP - bottomObstacle.getHeight());
    }

    public Texture getTopObstacle() {
        return topObstacle;
    }

    public Texture getBottomObstacle() {
        return bottomObstacle;
    }

    public Vector2 getPosTopObstacle() {
        return posTopObstacle;
    }

    public Vector2 getPosBotObstacle() {
        return posBotObstacle;
    }
}
