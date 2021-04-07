package model;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Personagem {
	private int x,y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	private int velocidade;
	private boolean isVisivel;
	
	public Personagem() {
		this.x = 300;
		this.y = 300;
		this.altura= 100;
		this.largura = 100;
		this.velocidade = 3;
		this.isVisivel = true;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res//duck-pixel.png");
		imagem = referencia.getImage();
		

		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public Rectangle getBounds() {
		
		return new Rectangle(x, y, largura, altura);
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo==KeyEvent.VK_UP) {
			dy = -velocidade;
		}
		if(codigo==KeyEvent.VK_DOWN) {
			dy = velocidade;
		}
		if(codigo==KeyEvent.VK_LEFT) {
			dx = -velocidade;
		}
		if(codigo==KeyEvent.VK_RIGHT) {
			dx = velocidade;
		}
	}
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo==KeyEvent.VK_UP) {
			dy = 0;
		}
		if(codigo==KeyEvent.VK_DOWN) {
			dy = 0;
		}
		if(codigo==KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if(codigo==KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}
	
}
