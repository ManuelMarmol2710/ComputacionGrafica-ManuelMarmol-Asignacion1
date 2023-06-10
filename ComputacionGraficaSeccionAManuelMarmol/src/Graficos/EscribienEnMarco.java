package Graficos;
import java.awt.Graphics;

import javax.swing.*;
public class EscribienEnMarco {

	public static void main(String[] args) {
	MarcoConTexto mimarco = new MarcoConTexto();
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoConTexto extends JFrame {
	
	public MarcoConTexto () {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer Texto");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
	
class Lamina extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Clases de Computacion Grafica", 100, 100);
	}
}
}
