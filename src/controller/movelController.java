package controller;

//import java.awt.Image;
import java.util.ArrayList;
//import java.util.List;

//import javax.swing.ImageIcon;

import model.Movel;

public class movelController {
	public static void main(String[] args) {
		
		Movel movel_1 = new Movel("mesa", 100, 100, "res\\mesa.png", 100, 100, true);
		Movel movel_2 = new Movel("mesa jantar", 100, 300, "res\\mesa.png", 100, 100, true);
		
		setMoveis(movel_1);
		setMoveis(movel_2);
	}
	
	private static void setMoveis(Movel movel) {
		Movel.setMoveis(movel);
	}

	public static ArrayList<Movel> getMoveis(){

		ArrayList<Movel> moveis = Movel.getMoveis();
		
		return moveis;
	}
	
//	public void load() {
//		List<Movel> moveis = new ArrayList<>();
//		
//		moveis = Movel.getMoveis();
//
//		for (Movel movel : moveis) {
//			ImageIcon referencia = new ImageIcon(movel.getCaminho());
//			Image a = referencia.getImage();
//			movel.setImagem(a);
//			
//			movel.setAltura(a.getHeight(null));
//			movel.setLargura(a.getWidth(null));
//		}
//	}
}
