package sheet.core;

import javax.swing.JFrame;

public class CharSheet extends JFrame {

	public CharSheet() {
		setSize(500, 500);
		Selector selector = new Selector(this);
		selector.setVisible(true);
		
	}
	public static void main(String[] args) {
		CharSheet sheet = new CharSheet();
		sheet.setVisible(true);
	}
}
