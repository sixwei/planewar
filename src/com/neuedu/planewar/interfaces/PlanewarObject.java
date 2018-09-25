package com.neuedu.planewar.interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.neuedu.planewar.client.PlanewarClient;

public abstract class PlanewarObject implements MoveAble, DrawAble {

	public String name;

	/**
	 * ��Ҫ��ͼƬ�Ĵ���
	 */
	public Image image;
	/**
	 * Object ��������ƶ����ٶ�
	 */
	public int x;
	public int y;
	public int speed;
	
	//�����н���
	public PlanewarClient pwc;
	
	//����ͼƬ�Ŀ�Ⱥ͸߶�
	public int width;
	public int height;
	
	public boolean live=true;
	

	@Override
	public void move() {
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
		move();
	}
	
	
	public Rectangle getRectangle() {
		return new Rectangle(x,y,width,height);
	}
	

}
