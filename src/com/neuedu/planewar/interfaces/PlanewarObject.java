package com.neuedu.planewar.interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;

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
	
	//�жϷɻ��Ƿ���(���ӵ����д��) �ж��ӵ��Ƿ����
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
