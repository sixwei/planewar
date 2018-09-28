package com.neuedu.planewar.entity;

import java.awt.Graphics;
import java.awt.Image;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.util.ImageUtil;

public class EnemyPlaneTwo extends Enemyplane {
	
	
	private Image[] enemyplane = {
			ImageUtil.getImg("enemyplane_02_01"),
			ImageUtil.getImg("enemyplane_02_02"),
			ImageUtil.getImg("enemyplane_02_03"),
			
	};
	
	  public EnemyPlaneTwo(){
		  
	  }
	  
	  public EnemyPlaneTwo(PlanewarClient pwc,int x,int y) {
		  this.pwc = pwc;
		  this.x=x;
		  this.y=y;
		  this.planeimages = enemyplane;
		  this.speed=10;
		  this.live = true;
	  }
	  
	
	  
	 //ÖØÐ´move·½·¨ 
	@Override
	public void move() {
		if(x>Constant.GAME_WIDTH) {
			RIGHT = false;
		}
		if(x<0) {
			RIGHT = true;
		}
		
		if(RIGHT) {
			x+=speed;
		}else {
			x-=speed;
		}
		
		if(r.nextInt(1000)>950) 
			fire();
	}
	

	 
	  

}
