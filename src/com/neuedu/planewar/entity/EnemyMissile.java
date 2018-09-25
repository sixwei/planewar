package com.neuedu.planewar.entity;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.util.ImageUtil;

public class EnemyMissile extends Missiler {
	
	
	public EnemyMissile() {
		// TODO Auto-generated constructor stub
	}
	
	public EnemyMissile(int x,int y,PlanewarClient pwc) {
		this.x = x;
		this.y = y;
		image = ImageUtil.getImg("mymissile_04");
		this.speed = 10;
		this.pwc = pwc;
	}
	
	
	@Override
	public void move() {
		y+=speed;
		super.outOfBounds();
		
	}
	

}
