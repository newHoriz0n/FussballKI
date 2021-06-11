package view;

import javax.swing.JFrame;

import model.FussballKI;

public class JMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JMain() {
		
		FussballKI fki = new FussballKI();
		
		JPanelView jpv = new JPanelView(fki);
		jpv.setPanelView(new VFussballKIPanelView(fki));
		add(jpv);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String [] arg) {
		JMain mainWindow = new JMain();
		mainWindow.requestFocus();
	}
	
}
