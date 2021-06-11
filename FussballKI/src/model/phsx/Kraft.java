package model.phsx;

import model.Vektor3D;

public class Kraft {

	private Vektor3D wirkung; // [N]
	
	
	public Kraft(Vektor3D wirkung) {
		this.wirkung = new Vektor3D(wirkung);
	}
	
	public Vektor3D getWirkung(double faktor) {
		return wirkung.getSkaliertenVektor(faktor);
	}
	
}
