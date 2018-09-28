package com.neuedu.planewar.constant;

import com.neuedu.planewar.util.GameUtil;

public class Constant {
	
	public static final int GAME_WIDTH=Integer.parseInt(GameUtil.prop.getProperty("GAME_WIDTH"));
	public static final int GAME_HEIGHT=Integer.parseInt(GameUtil.prop.getProperty("GAME_HEIGHT"));

}
