package com.neuedu.planewar.util;

import java.awt.Image;

import java.util.HashMap;
import java.util.Map;


public class ImageUtil {

	
	
	private ImageUtil() {
		
	}
	
	private final static Map<String,Image> map = new HashMap<>();
	
	static {
		map.put("main_icon",GameUtil.getImg("images/icon/main_icon.png"));
		map.put("plane", GameUtil.getImg("images/plane.png"));
		
		//�ҷ��ɻ��Ķ�̬ͼ
		map.put("myplane_01", GameUtil.getImg("images/plane/myplane/myplane_01.png"));
		map.put("myplane_02", GameUtil.getImg("images/plane/myplane/myplane_02.png"));
		map.put("myplane_03", GameUtil.getImg("images/plane/myplane/myplane_03.png"));
		map.put("myplane_04", GameUtil.getImg("images/plane/myplane/myplane_04.png"));
		map.put("myplane_05", GameUtil.getImg("images/plane/myplane/myplane_05.png"));
		
		//  �ҷ����ӵ�
		map.put("mymissile_plus", GameUtil.getImg("images/missile/mymissile/mymissile_plus.png"));
		
		//�ҷ����ӵ�
		map.put("mymissile_01", GameUtil.getImg("images/missile/mymissile/mymissile_01.png"));
		map.put("mymissile_02", GameUtil.getImg("images/missile/mymissile/mymissile_02.png"));
		map.put("mymissile_03", GameUtil.getImg("images/missile/mymissile/mymissile_03.png"));
		map.put("mymissile_04", GameUtil.getImg("images/missile/mymissile/mymissile_04.png"));
		
		//���صл�
		//����һ�ŵл�
		map.put("enemyplane_01_01", GameUtil.getImg("images/plane/enemyplane/enemyplane_01_01.png"));
		map.put("enemyplane_01_02", GameUtil.getImg("images/plane/enemyplane/enemyplane_01_02.png"));
		map.put("enemyplane_01_03", GameUtil.getImg("images/plane/enemyplane/enemyplane_01_03.png"));
		
		//���ض��ŵл�
		map.put("enemyplane_02_01", GameUtil.getImg("images/plane/enemyplane/enemyplane_02_01.png"));
		map.put("enemyplane_02_02", GameUtil.getImg("images/plane/enemyplane/enemyplane_02_02.png"));
		map.put("enemyplane_02_03", GameUtil.getImg("images/plane/enemyplane/enemyplane_02_03.png"));
	}
	
	
	
	
	//��������Լ���    ����ͼƬ��ʱ������������
	public static Image getImg(String key) {
		return map.get(key);
	}
	
	
	
}
