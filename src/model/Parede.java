package model;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.ImageIcon;

public class Parede {
	private String tipo;
	private int x,y;
	private String caminho;
	private Image imagem;
	private int altura, largura;
	private boolean isVisivel;
	private static List<Parede> paredes = new ArrayList<>();



	public Parede() {
		this.x = 0;
		this.y = 0;
		this.caminho = "res\\piso.png";
		this.altura= 100;
		this.largura = 100;
		this.isVisivel = false;
	}

	public Parede(String tipo, int x, int y, String caminho, int altura, int largura, boolean isVisivel) {
		super();
		this.tipo = tipo;
		this.x = x;
		this.y = y;
		this.caminho = caminho;
		this.altura = altura;
		this.largura = largura;
		this.isVisivel = isVisivel;
	}

	public static ArrayList<Parede> getParedes(){
		return (ArrayList<Parede>) paredes;
	}
	
	public static void setParedes(Parede parede) {
		paredes.add(parede);
	}
	public void load() {
		List<Parede> paredes = new ArrayList<>();
		
		paredes = Parede.getParedes();

		for (Parede parede : paredes) {
			ImageIcon referencia = new ImageIcon(parede.getCaminho());
			Image a = referencia.getImage();
			parede.setImagem(a);
			
//			parede.setAltura(a.getHeight(null));
//			parede.setLargura(a.getWidth(null));
		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public Image getImagem() {
		return imagem;
	}

	public void setImagem(Image imagem) {
		this.imagem = imagem;
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

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static void setParedes(List<Parede> paredes) {
		Parede.paredes = paredes;
	}
}