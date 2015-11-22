// Programmer: David Fleurantin
// Date: September 10, 2014

import javax.swing.JOptionPane;

public class LabP18 {
	public static void main(String[]args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + "!");
		System.exit(0);
	}
}
