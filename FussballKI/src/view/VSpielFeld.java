package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.SpielFeld;

public class VSpielFeld {
	private double [] feldGroesse;	// [cm]
	
	public VSpielFeld(SpielFeld spielFeld) {
		this.feldGroesse = new double [] {spielFeld.getLange(),spielFeld.getBreite()};
	}
	
	public void drawSpielFeld(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(15));
		g.drawRect(0, 0, (int)(feldGroesse[0]), (int)(feldGroesse[1]));
	}

	
}
