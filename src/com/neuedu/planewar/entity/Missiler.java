package com.neuedu.planewar.entity;


import java.util.List;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.interfaces.PlanewarObject;
import com.neuedu.planewar.util.ImageUtil;

public class Missiler extends PlanewarObject {
	
	public Missiler(){
		
		this.speed=50;
	}
	
	public Missiler(int x,int y,PlanewarClient pwc) {
		this();
		this.x=x;
		this.y=y;
		this.pwc = pwc;
		this.image = ImageUtil.getImg("mymissile_plus");
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	
	
	
	
	
	@Override
	public void move() {
		y-=speed;
		outOfBounds();
	}

	
	
	public void outOfBounds() {
		if(x<-500||x>Constant.GAME_WIDTH+500
				||y<-500||y>Constant.GAME_HEIGHT+500) {
			live=false;
			pwc.missilers.remove(this);
		}
	}
	
	//对于我方打敌机的行为
	public boolean hitplane(Enemyplane p) {
		if(	this.getRectangle().intersects(p.getRectangle())) {
			p.live = false;
			System.out.println("打到了");
			return true;
		}
	return false;
	}
	
	//重载，敌方的飞机不止有一辆
	public boolean hitplane(List<Enemyplane> enemyplanes) {
		
		for(int j=0;j<enemyplanes.size();++j) {
			Enemyplane enemyplane = enemyplanes.get(j);
			if(hitplane(enemyplane)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
