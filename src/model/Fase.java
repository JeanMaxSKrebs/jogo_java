package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import controller.movelController;

@SuppressWarnings("serial")
public class Fase extends JPanel implements ActionListener{
	
	private Image fundo;
	private Personagem personagem;
	private Movel movel;
	private Timer velocidade;
	private int largura, altura;
	
	
	public Fase() {
		this.largura = 1024;
		this.altura = 694;
		setFocusable(true);
		setDoubleBuffered(true);
		ImageIcon referencia = new ImageIcon("res\\black.png");
		fundo = referencia.getImage();
		
		movelController.main(null);

		movel = new Movel();
		movel.load();
		
		personagem = new Personagem();
		personagem.load();
		
		addKeyListener(new TecladoAdapter());
		
		velocidade = new Timer(5, this);
		velocidade.start();
		
	}
	
	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);

//		System.out.println(movel);

		for (Movel m : movel.getMoveis()) {
		graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
		}
		
		graficos.drawImage(personagem.getImagem(), personagem.getX(), personagem.getY(), this);
		g.dispose();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		personagem.update();
		checarColisoes();
		repaint();
	}
	
	public void checarColisoes(){	
		Rectangle formaPersonagem = personagem.getBounds();
		
		if(formaPersonagem.y<0) {
			personagem.setY(0);
		}
		if(formaPersonagem.x<0) {
			personagem.setX(0);
		}
		if((formaPersonagem.x+formaPersonagem.width)>largura) {
			personagem.setX(largura-formaPersonagem.width);
		}
		if((formaPersonagem.y+formaPersonagem.height)>altura) {
			personagem.setY(altura-formaPersonagem.height);
		}
		
		 
		
		
//		Rectangle formaTela;
//		Rectangle formaInimigo;
	}

	
	private class TecladoAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			personagem.keyPressed(e);
		}
		@Override
		public void keyReleased(KeyEvent e) {
			personagem.keyRelease(e);
		}
	}

}
