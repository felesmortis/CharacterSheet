package sheet.core;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

import net.sourceforge.jtds.jdbc.Driver;

import java.io.*;

public class Selector extends JDialog {
	public static ArrayList<Character> chars;
	private JLabel lblName;
	private JTextField txtName;
	private JButton btnFind;
	public Selector(JFrame owner) {
		super(owner, "Select a character", true);
		this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		lblName = new JLabel("Name:");
		txtName = new JTextField();
		
		/*Driver d = new Driver();
		String url = "jdbc:jtds:sqlserver://MORTUUSFELES:1433/;instance=SQLEXPRESS;";
		try {
			if(d.acceptsURL(url)) {
				System.out.println(url);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	private void readChars() {
		File file = new File("");
	}
}
