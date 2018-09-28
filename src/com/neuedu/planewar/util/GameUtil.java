package com.neuedu.planewar.util;

/**
 * 用来对于游戏中的所有的静态资源（图片，音频，配置文件）的加载
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.imageio.ImageIO;

public class GameUtil {
	
	
	
	/**
	 * 对于游戏中的一些常量的配置利用properties文件做响应的处理
	 * 对于静态资源的加载利用类加载器还是利用Resource类呢
	 * @param path
	 * @return
	 */
	
	
	public static Properties prop = new Properties();
	
	static {
		try {
			prop.load(GameUtil.class.getClassLoader().getResourceAsStream("planegame.properties"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static Image getImg(String path) {
		
		URL url = ImageUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return img;
	}
	
	

}
