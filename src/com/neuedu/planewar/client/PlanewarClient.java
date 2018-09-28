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
	
	//Missler Ӧ��Ϊһ�������ж��ʵ��
	//Missiler missiler = new Missiler(300,500);
	//����˫�����ӵ�����
	public ArrayList<Missiler> missilers = new ArrayList<>();
	
	//�����л���ͼ
	
	//public Enemyplane enemplane = new Enemyplane(300,50);
	//�з��ɻ�����
	public ArrayList<Enemyplane> enemyplanes = new ArrayList<>();
	
	

	/**
	 * ��д�����load����
	 * @param args
	 */
	@Override
	public void load() {
		// TODO Auto-generated method stub
		super.load();
		this.setTitle("�ɻ���ս");
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
		
		//���صз�һ�ŷɻ�
		for(int i=0;i<10;++i) {
			Enemyplane enemyplane = new Enemyplane(this,160+i*120,300);
			enemyplanes.add(enemyplane);
		}
		//���صз����ŷɻ�
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
			//�ڻ����ӵ���ʱ������ж��Ƿ���˵л�
			missiler.hitplane(enemyplanes);
			
		}
		//�з��ɻ�
		for (Enemyplane enemyplane : enemyplanes) {
			enemyplane.draw(g);
		}
		
		
		
		//��������
		g.setFont(new Font("΢���ź�", Font.BOLD, 30));
		g.drawString("�ӵ�������"+missilers.size(), 300, 300);
		
	}
	
	
	
	public static void main(String[] args) {
		new PlanewarClient().load();
	}
}
