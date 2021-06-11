package model;

public class Vektor3D {

	private double x, y, z;

	public Vektor3D() {
		x = 0;
		y = 0;
		z = 0;
	}

	public Vektor3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vektor3D(Vektor3D pos) {
		this.x = pos.x;
		this.y = pos.y;
		this.z = pos.z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double calcDistance(Vektor3D v) {
		return Math.sqrt(Math.pow(x - v.x, 2) + Math.pow(y - v.y, 2) + Math.pow(z - v.z, 2));
	}

	public void set(double posX, double posY, double posZ) {
		this.x = posX;
		this.y = posY;
		this.z = posZ;
	}

	public Vektor3D getSkaliertenVektor(double faktor) {
		return new Vektor3D(x * faktor, y * faktor, z * faktor);
	}

	public double calcVektorLaenge() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}

}
