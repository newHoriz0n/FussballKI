package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import model.Model;

public class JPanelView extends JPanel implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private VPanelView vpv;
	
	public JPanelView(Model m)  {
		
		setDoubleBuffered(true);
		
		addMouseListener(this);
		
		TimerTask t = new TimerTask() {
			
			@Override
			public void run() {
				updateUI();
			}
		};

		Timer timer = new Timer();
		timer.schedule(t, 0, 10);
	}
	
	public void setPanelView(VPanelView view) {
		this.vpv = view;
	}
	
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());		
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		vpv.drawPanelView(g2d);		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		vpv.onMousePress(e.getButton(), e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		vpv.onMouseRelease(e.getButton(), e.getX(), e.getY());
	}
	
	
}
