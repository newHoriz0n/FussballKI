package view;

import java.awt.Color;
import java.awt.Graphics2D;

import model.Ball;

public class VBall extends VObjekt {

	private Ball b;

	public VBall(Ball b) {
		this.b = b;
	}

	@Override
	public void drawObject(Graphics2D g) {
		if (b != null) {
			double[] pos = b.getPosition2D();
			g.setColor(Color.BLACK);
			g.fillOval((int) ((pos[0] - b.getGroesse() / 2.0)), (int) ((pos[1] - b.getGroesse() / 2.0)),
					(int) (b.getGroesse()), (int) (b.getGroesse()));
		}
	}
}
