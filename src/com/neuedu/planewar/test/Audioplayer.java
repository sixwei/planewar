package com.neuedu.planewar.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Audioplayer {
	
	
	Player player;
	File music;
	
	public Audioplayer(String musicpath) {
		this.music = new File(musicpath);
	}
	
	public void play() throws FileNotFoundException, JavaLayerException {
		
		BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music));
		
		player = new Player(buffer);
		player.play();
		
	}
	
	public static void main(String[] args) {
		Audioplayer audio = new Audioplayer("src/sounds/v1.mp3");
		try {
			audio.play();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
