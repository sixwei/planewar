package com.neuedu.planewar.entity;


import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.util.ImageUtil;

public class Enemyplane extends Plane {
	
	
	private Image[] enemyplane = {
			ImageUtil.getImg("enemyplane_01_01"),
			ImageUtil.getImg("enemyplane_01_02"),
			ImageUtil.getImg("enemyplane_01_03"),
			
	};
	
	public Enemyplane() {
		
	}
	
	
	public Enemyplane(int x,int y) {
		this.x = x;
		this.y = y;
		this.planeimages = enemyplane;
	}
	
	public Enemyplane(PlanewarClient pwc,int x,int y) {
		this.pwc =pwc;
		this.x = x;
		this.y = y;
		this.planeimages = enemyplane;
		this.width = planeimages[0].getWidth(null);
		this.height = planeimages[0].getHeight(null);
		this.speed = 3;
	}
	
	
	
	
	@Override
	public void move() {
		//绘制正弦曲线 没有成功  参数方程还是其他的方程
//		y+=speed;
//		x=(int) Math.cos((double)y);
		
		if(x>Constant.GAME_WIDTH) {
			RIGHT = false;
		}
		if(x<0) {
			RIGHT = true;
		}
		if(RIGHT) {
			y+=speed;
			x+=speed;
		}else {
			x-=speed;
			y+=speed;
		}
		
		
		
		
		if(r.nextInt(1000)>980)	fire();
	}
	
	public final Random r = new Random();
	
	
	@Override
	public void draw(Graphics g) {
		if(!live) {
			pwc.missilers.remove(this);
			return;
		}
		super.draw(g);
	}
	
	
	// 怎样区分敌我子弹
	@Override
	public void fire() {
		EnemyMissile enemymissile = new EnemyMissile(x,y,pwc);
		pwc.missilers.add(enemymissile);
	}
	
	

}
