package model;

public class Spieler {

	private Vektor3D position;
	private double ausrichtung;
	
	public Spieler(Vektor3D pos, double ausrichtung) {
		this.position = new Vektor3D(pos);
		this.ausrichtung = ausrichtung;
	}
	
	/**
	 * 
	 * @return Spielerposition von oben in integer
	 */
	public int[] getSpielerPosition2D() {
		return new int [] {(int)position.getX(),(int)position.getY()};
	}

	public double getAusrichtung() {
		return ausrichtung;
	}
	
	public double getGroesse() {
		return 100;
	}
	
}
