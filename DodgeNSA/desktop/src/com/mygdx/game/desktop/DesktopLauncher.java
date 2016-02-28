package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.DodgeNSA;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = DodgeNSA.WIDTH;
		config.height = DodgeNSA.HEIGHT;
		config.title = DodgeNSA.TITLE;
		new LwjglApplication(new DodgeNSA(), config);
	}
}
