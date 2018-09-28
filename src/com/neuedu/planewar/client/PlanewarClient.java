package com.neuedu.planewar.client;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import com.neuedu.planewar.entity.EnemyPlaneTwo;
import com.neuedu.planewar.entity.Enemyplane;
import com.neuedu.planewar.entity.Missiler;
import com.neuedu.planewar.entity.Plane;
import com.neuedu.planewar.util.FrameUtil;
import com.neuedu.planewar.util.ImageUtil;
import com.neuedu.planewar.util.MusicUtil;
import com.neuedu.planewar.util.SoundsUtil;

public class PlanewarClient extends FrameUtil {

	
	private static final long serialVersionUID = 7144381797927832093L;
	
	
	//private int count;

	
	Plane myplane = new Plane(this,600,800);
	
	//Missler 应该为一个数组有多个实例
	//Missiler missiler = new Missiler(300,500);
	//敌我双方的子弹容器
	public ArrayList<Missiler> missilers = new ArrayList<>();
	
	//单个敌机动图
	
	//public Enemyplane enemplane = new Enemyplane(300,50);
	//敌方飞机容器
	public ArrayList<Enemyplane> enemyplanes = new ArrayList<>();
	
	

	/**
	 * 重写父类的load方法
	 * @param args
	 */
	@Override
	public void load() {
		// TODO Auto-generated method stub
		super.load();
		this.setTitle("飞机大战");
		this.setIconImage(ImageUtil.getImg("main_icon"));
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				myplane.keyPressed(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				myplane.keyReleased(e);
			}
		});
		
		new MusicUtil(false).start();
		
		//加载敌方一号飞机
		for(int i=0;i<10;++i) {
			Enemyplane enemyplane = new Enemyplane(this,160+i*120,300);
			enemyplanes.add(enemyplane);
		}
		//加载敌方二号飞机
		for(int y=0;y<6;++y) {
			EnemyPlaneTwo enemytwo = new EnemyPlaneTwo(this,160+y*120,100);
			enemyplanes.add(enemytwo);
		}
		
	}
	
	@Override
	public void paint(Graphics g) {

		myplane.draw(g);
		//missiler.draw(g);
		//enemplane.draw(g);
//		
//		for (Missiler missiler : missilers) {
//			missiler.draw(g);
//		}
		
		for(int i=0;i<missilers.size();++i) {
			Missiler missiler = missilers.get(i);
			missiler.draw(g);
			//在绘制子弹的时候进行判断是否打到了敌机
			missiler.hitplane(enemyplanes);
			
		}
		//敌方飞机
		for (Enemyplane enemyplane : enemyplanes) {
			enemyplane.draw(g);
		}
		
		
		
		//测试数据
		g.setFont(new Font("微软雅黑", Font.BOLD, 30));
		g.drawString("子弹的数量"+missilers.size(), 300, 300);
		
	}
	
	
	
	public static void main(String[] args) {
		new PlanewarClient().load();
	}
}
