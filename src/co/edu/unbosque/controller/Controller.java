package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.SimonElNumero;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private SimonElNumero si;
	private View gui;
	String num = "";
	private int i = 0;
	private int[] numr = new int[4];
	private int[] numt = new int[4];

	public Controller() {
		funcionar();
	}

	private void funcionar() {
		si = new SimonElNumero();
		gui = new View(this);
		gui.setVisible(true);
		 gui.getPanelCentral().setVisible(false);
        mostrarnumero();
       
		gui.getPanelSuperior().getNumero1().setText(numr[0]+"");
		gui.getPanelSuperior().getNumero2().setText(numr[1]+"");
		gui.getPanelSuperior().getNumero3().setText(numr[2]+"");
		gui.getPanelSuperior().getNumero4().setText(numr[3]+"");
		timer();
		gui.getPanelSuperior().setVisible(false);
		 gui.getPanelCentral().setVisible(true);

		
		

	}
	
	public void timer() {
		try {
			Thread.sleep(1*4000);
			
		}catch (InterruptedException e) {
			
		}
	}

	public String mostrarnumero() {
		int i = 0;
		String j = "";
		numr[0] = si.getGen().generarnumeroA();
		numr[1] = si.getGen().generarnumeroA();
		numr[2] = si.getGen().generarnumeroA();
		numr[3] = si.getGen().generarnumeroA();

		for (i = 0; i < 4; i++) {
			j += numr[i] + "";

		}
		num = j;

		return j;
	}

	public String mostrarnumt() {

		int i = 0;
		String j = "";

		for (i = 0; i < 4; i++) {
			j += numt[i];
		}
		return j;
	}

	public void tester() {

		String numt = mostrarnumt();
		if (si.getGen().compararnumeros(num, numt) == true) {
			JOptionPane.showMessageDialog(null, "Felicidades\n" + "has ganado  :v");

		} else
			JOptionPane.showMessageDialog(null, "Sigue intentando");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(gui.getPanelInferior().TERMINAR)) {
			tester();
			gui.Mostrar("Numero Correcto\n" + num);
			JOptionPane.showMessageDialog(null,"Numero que digitaste\n"+ mostrarnumt());
			System.exit(0);

		} else if (e.getActionCommand().equals(gui.getPanelCentral().ONE)) {

			numt[i] = 1;
			i++;

		} else if (e.getActionCommand().equals(gui.getPanelCentral().TWO)) {

			numt[i] = 2;
			i++;

		} else if (e.getActionCommand().equals(gui.getPanelCentral().THREE)) {

			numt[i] = 3;
			i++;

		} else if (e.getActionCommand().equals(gui.getPanelCentral().FOUR)) {

			numt[i] = 4;
			i++;

		}
	 

	}
	
	
	
	
			

	
}
