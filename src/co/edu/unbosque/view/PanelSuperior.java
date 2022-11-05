package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSuperior extends JPanel {

	private JLabel labEntrada;

	private JTextField Numero1;
	private JTextField Numero2;
	private JTextField Numero3;
	private JTextField Numero4;


	public PanelSuperior() {

		labEntrada = new JLabel("NUMERO");
		Numero1 = new JTextField("");
		Numero1.setForeground(Color.BLACK);
		Numero1.setBackground(Color.WHITE);
		Numero2 = new JTextField("");
		Numero2.setForeground(Color.BLACK);
		Numero2.setBackground(Color.WHITE);
		Numero3 = new JTextField("");
		Numero3.setForeground(Color.BLACK);
		Numero3.setBackground(Color.WHITE);
		Numero4 = new JTextField("");
		Numero4.setForeground(Color.BLACK);
		Numero4.setBackground(Color.WHITE);
		setLayout(new GridLayout(2, 5));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));

		add(labEntrada);
		add(Numero1);
		add(Numero2);
		add(Numero3);
		add(Numero4);
		


	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getNumero1() {
		return Numero1;
	}

	public void setNumero1(JTextField numero1) {
		Numero1 = numero1;
	}

	public JTextField getNumero2() {
		return Numero2;
	}

	public void setNumero2(JTextField numero2) {
		Numero2 = numero2;
	}

	public JTextField getNumero3() {
		return Numero3;
	}

	public void setNumero3(JTextField numero3) {
		Numero3 = numero3;
	}

	public JTextField getNumero4() {
		return Numero4;
	}

	public void setNumero4(JTextField numero4) {
		Numero4 = numero4;
	}



}
