package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelInferior extends JPanel {

	

	private JButton butTerminar;
	public static final String TERMINAR = "Terminar";

	public PanelInferior() {
		
		
		butTerminar= new JButton(TERMINAR);
		butTerminar.setActionCommand(TERMINAR);
		
		add(butTerminar,BorderLayout.CENTER);
		
	}


	public JButton getButTerminar() {
		return butTerminar;
	}

	public void setButTerminar(JButton butTerminar) {
		this.butTerminar = butTerminar;
	}

	public static String getTerminar() {
		return TERMINAR;
	}


	
}



