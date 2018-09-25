package com.neuedu.planewar.interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.neuedu.planewar.client.PlanewarClient;

public abstract class PlanewarObject implements MoveAble, DrawAble {

	public String name;

	/**
	 * 需要的图片的传输
	 */
	public Image image;
	/**
	 * Object 的坐标和移动的速度
	 */
	public int x;
	public int y;
	public int speed;
	
	//加入中介者
	public PlanewarClient pwc;
	
	//关于图片的宽度和高度
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
