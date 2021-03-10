import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class RoachSimulation {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter intial roach populaiton: ");
		double population = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "The Initial Roach Population is: " + population);
		
		RoachPopulation bugs = new RoachPopulation(population);
		
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 1 is: " + population * 2);
		
		String input2 = JOptionPane.showInputDialog("Enter spray percentge for cycle 1: ");
		double spraypct = Double.parseDouble(input2); 
		
				JOptionPane.showMessageDialog(null, "The Roach Population after cycle 1 50 percent spraying is: " + spraypct * (population * 2));
		
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 2 is: " + population * 2);
		
		String input3 = JOptionPane.showInputDialog("Enter spray percentge for cycle 2: ");
		double spraypct2 = Double.parseDouble(input3);
		
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 2 60 percent spraying is: " + (population * 2) * spraypct2);//.4
		
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 3 is: " + population * 1.6);
		
		String input4 = JOptionPane.showInputDialog("Enter spray percentge for cycle 3: ");
		double spraypct3 = Double.parseDouble(input4);
		
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 3 70 percent spraying is: " + (population * 1.6) * spraypct3);//.3125
	
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 4 is: " + population);
		
		String input5 = JOptionPane.showInputDialog("Enter spray percentge for cycle 4: ");
		double spraypct4 = Double.parseDouble(input4);
	
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle 4 80 percent spraying is: " + population * .5);//.5
	
	}


}
