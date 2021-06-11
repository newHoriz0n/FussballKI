package model;

public class SpielFeld {

	private double[] groesse;
	
	public SpielFeld(double laenge, double breite) {
		this.groesse = new double[] {laenge, breite};
	}
	
	public double getLange() {
		return groesse[0];
	}
	
	public double getBreite() {
		return groesse[1];
	}

	
}
