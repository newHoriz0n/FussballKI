package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.Spieler;

public class VSpieler extends VObjekt {

	private Spieler s;

	public VSpieler(Spieler s) {
		this.s = s;
	}

	@Override
	public void drawObject(Graphics2D g) {
		int[] pos = s.getSpielerPosition2D();
		g.setColor(Color.RED);
		g.fillOval((int) ((pos[0] - s.getGroesse() / 2.0)), (int) ((pos[1] - s.getGroesse() / 2.0)),
				(int) (s.getGroesse()), (int) (s.getGroesse()));
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		g.drawOval((int) ((pos[0] - s.getGroesse() / 2.0)), (int) ((pos[1] - s.getGroesse() / 2.0)),
				(int) (s.getGroesse()), (int) (s.getGroesse()));
		g.drawLine((int) (pos[0]), (int) (pos[1]),
				(int) ((pos[0] + s.getGroesse() * 0.5 * Math.cos(s.getAusrichtung()))),
				(int) ((pos[1] - s.getGroesse() * 0.5 * Math.sin(s.getAusrichtung()))));
	}

}
