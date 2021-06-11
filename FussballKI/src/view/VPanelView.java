package view;

import java.awt.Graphics2D;

import model.Model;

public abstract class VPanelView {


	protected int[] offset = new int [] {20, 20};
	protected double scale = 0.15;
	
	protected Model m;
	
	public VPanelView(Model m) {
		this.m = m;
	}
	
	public void drawPanelView(Graphics2D g) {
		
		g.translate(offset[0], offset[1]);
		g.scale(scale,scale);
		
		drawSpecificPanelView(g);
		
	}
	
	public abstract void drawSpecificPanelView(Graphics2D g);
	
	public void onMousePress(int button, int screenX, int screenY) {
		handleMousePress(button, (int)((screenX - offset[0]) / scale), (int)((screenY - offset[1]) / scale));
	}
	
	public void onMouseRelease(int button, int screenX, int screenY) {
		
	}
	
	public abstract void handleMousePress(int button, int realX, int realY);
	
	public abstract void handleMouseRelease(int button, int realX, int realY);
	
}
