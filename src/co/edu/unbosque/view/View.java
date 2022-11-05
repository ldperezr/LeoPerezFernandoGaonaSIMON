package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;

	private PanelSuperior panelSuperior;
	private PanelCentral panelCentral;
	private PanelInferior panelInferior;

	public View(Controller control) {

		setSize(600, 600);
		setResizable(false);
		setTitle("SIMON");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		panelSuperior = new PanelSuperior();
		add(panelSuperior, BorderLayout.NORTH);

		JPanel panelIzquierdo = new JPanel();
		add(panelIzquierdo, BorderLayout.WEST);

		panelCentral = new PanelCentral();
		add(panelCentral, BorderLayout.CENTER);

		JPanel panelDerecho = new JPanel();
		add(panelDerecho, BorderLayout.EAST);

		panelInferior = new PanelInferior();
		add(panelInferior, BorderLayout.SOUTH);

		panelCentral.getButOne().addActionListener(control);
		panelCentral.getButTwo().addActionListener(control);
		panelCentral.getButThree().addActionListener(control);
		panelCentral.getButFour().addActionListener(control);
		panelInferior.getButTerminar().addActionListener(control);

	}

	public void Mostrar(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public PanelSuperior getPanelSuperior() {
		return panelSuperior;
	}

	public void setPanelSuperior(PanelSuperior panelSuperior) {
		this.panelSuperior = panelSuperior;
	}

	public PanelCentral getPanelCentral() {
		return panelCentral;
	}

	public void setPanelCentral(PanelCentral panelCentral) {
		this.panelCentral = panelCentral;
	}

	public PanelInferior getPanelInferior() {
		return panelInferior;
	}

	public void setPanelInferior(PanelInferior panelInferior) {
		this.panelInferior = panelInferior;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
