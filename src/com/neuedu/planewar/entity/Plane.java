package com.neuedu.planewar.entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import com.neuedu.planewar.client.PlanewarClient;
import com.neuedu.planewar.constant.Constant;
import com.neuedu.planewar.interfaces.PlanewarObject;
import com.neuedu.planewar.util.ImageUtil;

public class Plane extends PlanewarObject {
	
	//飞机的几个状态
	public boolean LEFT,RIGHT,UP,DOWN;
	
	//子弹的几个状态
	public boolean FIRE;
	
	public int speed = 10;
	
	
	
	//  关于飞机的动图   还没有图片
	public  Image[] planeimages = {
			ImageUtil.getImg("myplane_01"),
			ImageUtil.getImg("myplane_02"),
			ImageUtil.getImg("myplane_03"),
			ImageUtil.getImg("myplane_04"),
			ImageUtil.getImg("myplane_05"),

	};
	
	
	
	public Plane() {
		
	}
	
	public Plane(Image img,int x,int y) {
		this.image = img;
		this.x = x;
		this.y = y;
	}
	
	public Plane(String imgKey,int x,int y) {
		
		this.image = ImageUtil.getImg(imgKey);
		this.x = x;
		this.y = y;
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	
	public Plane(PlanewarClient pwc,int x,int y) {
		this.x = x;
		this.y = y;
		this.width = planeimages[0].getWidth(null);
		this.height = planeimages[0].getHeight(null);
		this.pwc=pwc;
		
		
		
	}
	
	
	//计算器
	public int count=0;
	
	
	//进行绘制图片repaint是怎样实现的呢
	//对于动态图 是调用draw实现的结果
	@Override
	public void draw(Graphics g) {
		count = count%planeimages.length;
		g.drawImage(planeimages[count],x,y,null);
		count++;
		move();
		
	}
   
	
	//现在有个小bug   外边界可以超出去  已解决
	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(LEFT) {
			this.x-=speed;
		}
		if(RIGHT) {
			this.x+=speed;
		}
		if(UP) {
			this.y-=speed;
		}if(DOWN) {
			this.y+=speed;
		}
		if(x<=0) {
			x=0;
		}if(y<=28) {
			y=28;
		}if(x>=Constant.GAME_WIDTH-width) {
			x=Constant.GAME_WIDTH-width;
		}if(y>=Constant.GAME_HEIGHT-height) {
			y=Constant.GAME_HEIGHT-height;
		}
		
		if(FIRE) {
			fire();
		}
		
		
		
	}
	
	
	/**
	 * 对于键盘事件的函数
	 */
	
	public void keyPressed(KeyEvent e) {
		
		//System.out.println("按键");
		switch(e.getKeyCode()) {
		case KeyEvent.VK_A: this.LEFT=true;break;
		case KeyEvent.VK_D: this.RIGHT=true;break;
		case KeyEvent.VK_W: this.UP=true;break;
		case KeyEvent.VK_S: this.DOWN=true;break;
		case KeyEvent.VK_J: FIRE=true;break;
		case KeyEvent.VK_K: fire();break;
			
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_A: this.LEFT=false;break;
		case KeyEvent.VK_D: this.RIGHT=false;break;
		case KeyEvent.VK_W: this.UP=false;break;
		case KeyEvent.VK_S: this.DOWN=false;break;
		case KeyEvent.VK_J: FIRE=false;break;	
		}
	}
	
	
	public void fire() {
		Missiler missiler = new Missiler(x+90,y-60,pwc);
		
		pwc.missilers.add(missiler);
		
		//System.out.println("tianjiatupian");
		
	}

	
	
	
	
	
	
	
	
	

}
