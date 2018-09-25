package com.neuedu.planewar.util;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.neuedu.planewar.constant.Constant;

public class FrameUtil extends Frame {

	
	private static final long serialVersionUID = -5281699437957951269L;

	/*
	 * ����gui���ڵ����
	 * ���ڳ��󷽷������ã����󷽷�����ֱ�ӱ����� ���ǿ���ʹ�������ڲ��ࣩ
	 * 
	 * �ѽӿ��е�һЩ�������뵽��̬���п���ѡ���Ե���д��Ҫ�ķ���(adapter)
	 * 
	 */
	
	public void load() {
	
		this.setVisible(true);
		
		this.setTitle("phone wor");
		
		this.setSize(1500, 1000);
		
		this.setLocationRelativeTo(null);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		new FrameThread().start();
	
	}
	
	//���߳�ʵ��ͼƬ�����µĻ���
	private class FrameThread extends Thread {
		@Override
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(60);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	//���ͼƬ��˸��������˫���巽�������˸����
	
	Image backImg = null;
	
	//��дupdate�����������ڴ��ڵ�������һ�������ͼƬ
	
	@Override
	public void update(Graphics g) {
	
		if(backImg ==null) {
			
			backImg = createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
			
		}
		
		//��ȡ������ͼƬ�Ļ���
		Graphics backg = backImg.getGraphics();
		Color c = backg.getColor();
		backg.setColor(Color.WHITE);
		backg.fillRect(0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		backg.setColor(c);
		
		paint(backg);
		g.drawImage(backImg, 0, 0,null);
		
	}
	
}


