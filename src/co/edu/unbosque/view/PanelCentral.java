package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCentral extends JPanel{


	
	private JButton butOne;
	public static final String ONE = "1";
	private JButton butTwo;
	public static final String TWO = "2";
	private JButton butThree;
	public static final String THREE= "3";
	private JButton butFour;
	public static final String FOUR = "4";


	public PanelCentral() {
		
		setLayout( new GridLayout(2,4) );
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		Font fuente = new Font("Calibrí", 10, 60);
		butOne = new JButton(ONE);
		butOne.setFont(fuente);
		
		butTwo = new JButton(TWO);
		butTwo.setFont(fuente);
		
		butThree = new JButton(THREE);
		butThree.setFont(fuente);
		
		butFour = new JButton(FOUR);
		butFour.setFont(fuente);
		
		add(new JLabel(""));
		add(butOne);
		add(butTwo);
		add(new JLabel(""));
		add(new JLabel(""));
		add(butThree);
		add(butFour);
		add(new JLabel(""));

		
	}


	public JButton getButOne() {
		return butOne;
	}


	public void setButOne(JButton butOne) {
		this.butOne = butOne;
	}


	public JButton getButTwo() {
		return butTwo;
	}


	public void setButTwo(JButton butTwo) {
		this.butTwo = butTwo;
	}


	public JButton getButThree() {
		return butThree;
	}


	public void setButThree(JButton butThree) {
		this.butThree = butThree;
	}


	public JButton getButFour() {
		return butFour;
	}


	public void setButFour(JButton butFour) {
		this.butFour = butFour;
	}


	public static String getOne() {
		return ONE;
	}


	public static String getTwo() {
		return TWO;
	}


	public static String getThree() {
		return THREE;
	}


	public static String getFour() {
		return FOUR;
	}

	
	
}
