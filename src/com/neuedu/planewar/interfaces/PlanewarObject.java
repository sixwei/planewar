package com.neuedu.planewar.interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;

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
	
	//判断飞机是否存活(用子弹进行打击) 判断子弹是否出界
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
	
	
	public void outOfBounds() {
		if(x<-500||x>Constant.GAME_WIDTH+500
				||y<-500||y>Constant.GAME_HEIGHT+500) {
			live=false;
			pwc.missilers.remove(this);
		}
	}
	

}
