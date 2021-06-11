package model;

public class Ball {

	private Vektor3D position;
	private Vektor3D velocity;
	private Vektor3D acceleration;
	
	public Ball(int posX, int posY) {
		this.position = new Vektor3D(posX, posY, 0);
	}

	/**
	 * 
	 * @return Ballposition von oben
	 */
	public double[] getPosition2D() {
		return new double [] {position.getX(), position.getY()};
	}
	
	/**
	 * 
	 * @return [cm]
	 */
	public double getGroesse() {
		return 40;
	}
	
	public Vektor3D getVelocity() {
		return velocity;
	}
	
	public void setPosition(double posX, double posY) {
		position.set(posX, posY, 0);
	}
	
}
