package com.neuedu.planewar.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicUtil extends Thread {

	private Player player;

	private File music;
	
	private InputStream inputStream;

	private boolean loop;

	public MusicUtil(String musicpath) {
		this.music = new File(musicpath);
	}

	public MusicUtil(boolean loop) {
		this.inputStream = MusicUtil.class.getClassLoader().getResourceAsStream("src/sounds/v1.mp3");
		this.loop = loop;
	}

	@Override
	public void run() {
		super.run();
		try {
			if (loop) {
				while (true) {
					play();

				}

			} else {
				play();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void play() throws FileNotFoundException, JavaLayerException {

		BufferedInputStream buffer = new BufferedInputStream(inputStream);

		player = new Player(buffer);
		player.play();

	}

	

}
