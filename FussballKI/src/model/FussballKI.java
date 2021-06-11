package model;

import java.util.ArrayList;
import java.util.List;

public class FussballKI extends Model {

	private List<Spieler> spielerListe;
	private SpielFeld spielFeld;
	private Ball ball;

	public FussballKI() {
		this.spielerListe = new ArrayList<>();
		this.spielFeld = new SpielFeld(10000, 6600);

		spielerListe.add(new Spieler(new Vektor3D(1000, 3300, 0), 0));
//		spielerListe.add(new Spieler(new Vektor3D(30, 10, 0), Math.PI));
		
		this.ball = new Ball(5000,3300);

	}

	public List<Spieler> getSpielerListe() {
		return spielerListe;
	}

	public SpielFeld getSpielFeld() {
		return spielFeld;
	}

	public Ball getBall() {
		return ball;
	}

}
