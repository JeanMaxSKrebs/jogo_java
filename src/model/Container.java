package model;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Container extends JFrame{
	public Container() {
		
		add(new Fase());
		setTitle("Jogo");
		setSize(1015,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	public static void main(String []args) {
		new Container();
	}
}
