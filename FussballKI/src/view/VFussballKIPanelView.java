package view;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import model.FussballKI;
import model.Spieler;

public class VFussballKIPanelView extends VPanelView {

	private VSpielFeld spielfeld;
	private List<VSpieler> spieler;
	private VBall ball;

	public VFussballKIPanelView(FussballKI fki) {
		super(fki);

		this.spielfeld = new VSpielFeld(fki.getSpielFeld());

		spieler = new ArrayList<VSpieler>();
		for (Spieler s : fki.getSpielerListe()) {
			this.spieler.add(new VSpieler(s));
		}

		this.ball = new VBall(fki.getBall());
	}

	@Override
	public void drawSpecificPanelView(Graphics2D g) {
		spielfeld.drawSpielFeld(g);
		for (VSpieler s : spieler) {
			s.drawObject(g);
		}
		ball.drawObject(g);
	}

	@Override
	public void handleMousePress(int button, int realX, int realY) {
		if (button == 3) {
			((FussballKI) m).getBall().setPosition(realX, realY);
		} else if (button == 1) {
			
		}
	}

	@Override
	public void handleMouseRelease(int button, int realX, int realY) {
		// TODO Auto-generated method stub

	}

}
