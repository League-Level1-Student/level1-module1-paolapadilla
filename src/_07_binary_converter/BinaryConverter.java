package _07_binary_converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextField textfield= new JTextField();
		// Create JTextField
		// Add JTextField on panel
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(400, 400);
		panel.add(textfield);
		
	}
     
	public String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s,silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
}
