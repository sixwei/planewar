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
	 * 对于gui窗口的设计
	 * 对于抽象方法的设置（抽象方法不能直接被创建 但是可以使用匿名内部类）
	 * 
	 * 把接口中的一些方法放入到静态类中可以选择性的重写需要的方法(adapter)
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
	
	//多线程实现图片的重新的绘制
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
	
	//解决图片闪烁的问题用双缓冲方法解决闪烁问题
	
	Image backImg = null;
	
	//重写update（）方法，在窗口的里层添加一个虚拟的图片
	
	@Override
	public void update(Graphics g) {
	
		if(backImg ==null) {
			
			backImg = createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
			
		}
		
		//获取到虚拟图片的画笔
		Graphics backg = backImg.getGraphics();
		Color c = backg.getColor();
		backg.setColor(Color.WHITE);
		backg.fillRect(0, 0, Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		backg.setColor(c);
		
		paint(backg);
		g.drawImage(backImg, 0, 0,null);
		
	}
	
}


