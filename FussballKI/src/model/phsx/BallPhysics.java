package model.phsx;

import model.Ball;
import model.Spieler;

public class BallPhysics {

	private static double rohLuft = 1.003; // [kg/m³]
	private static double cwKugel = 0.45;

	public static void update(Ball b) {

		calcLuftWiderstand(b);

	}

	private static double calcLuftWiderstand(Ball b) {
		return rohLuft * cwKugel * Math.pow((b.getGroesse() / 2.0), 2) * Math.PI
				* Math.pow(b.getVelocity().calcVektorLaenge(), 2) * 0.5;
	}

	public static void schiessen(Spieler s, Ball b, double richtung) {
		
	}

}
