package com.neuedu.planewar.util;

/**
 * ����������Ϸ�е����еľ�̬��Դ��ͼƬ����Ƶ�������ļ����ļ���
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.imageio.ImageIO;

public class GameUtil {
	
	
	
	/**
	 * ������Ϸ�е�һЩ��������������properties�ļ�����Ӧ�Ĵ���
	 * ���ھ�̬��Դ�ļ����������������������Resource����
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
