package com.neuedu.planewar.entity;


import java.util.List;

import com.neuedu.planewar.client.PlanewarClient;
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

	
	
	
	
	//�����ҷ���л�����Ϊ
	public void hitplane(Enemyplane p) {
		if(	this.getRectangle().intersects(p.getRectangle())) {
			p.live = false;
			System.out.println("����");
		}
	}
	
	//���أ��з��ķɻ���ֹ��һ��
	public void hitplane(List<Enemyplane> enemyplanes) {
		
		for(int j=0;j<enemyplanes.size();++j) {
			Enemyplane enemyplane = enemyplanes.get(j);
			hitplane(enemyplane);
		}
	}
	
	
	
	

}
