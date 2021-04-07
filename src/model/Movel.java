package model;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.swing.ImageIcon;

public class Movel implements List<Movel> {
	private String nome;
	private int x,y;
	private String caminho;
	private Image imagem;
	private int altura, largura;
	private boolean isVisivel;
	private static List<Movel> moveis = new ArrayList<>();



	public Movel() {
		this.x = 0;
		this.y = 0;
		this.caminho = "res\\piso.png";
		this.altura= 100;
		this.largura = 100;
		this.isVisivel = false;
	}
	
	
	
	public Movel(String nome, int x, int y, String caminho, int altura, int largura,
			boolean isVisivel) {
		super();
		this.nome = nome;
		this.x = x;
		this.y = y;
		this.caminho = caminho;
		this.altura = altura;
		this.largura = largura;
		this.isVisivel = isVisivel;
	}

	public static ArrayList<Movel> getMoveis(){
		return (ArrayList<Movel>) moveis;
	}
	
	public static void setMoveis(Movel movel) {
		moveis.add(movel);
	}
	public void load() {
		List<Movel> moveis = new ArrayList<>();
		
		moveis = Movel.getMoveis();

		for (Movel movel : moveis) {
			ImageIcon referencia = new ImageIcon(movel.getCaminho());
			
			Image a = referencia.getImage();
			movel.setImagem(a);
			System.out.println(a.getHeight(null));
			
//			movel.setAltura(a.getHeight(null));
//			movel.setLargura(a.getWidth(null));
		}
	}

	public Rectangle getBounds() {
		
		return new Rectangle(x, y, largura, altura);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Movel [nome=" + nome + ", x=" + x + ", y=" + y + ", caminho=" + caminho + ", imagem=" + imagem
				+ ", altura=" + altura + ", largura=" + largura + ", isVisivel=" + isVisivel + "]\n";
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Movel> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Movel e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Movel> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Movel> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movel get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movel set(int index, Movel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Movel element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Movel remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Movel> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Movel> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movel> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
