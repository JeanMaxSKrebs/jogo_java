package controller;

import java.util.ArrayList;

import model.Movel;

public class movelController {
	public static void main(String[] args) {
		
		Movel movel_1 = new Movel("mesa", 100, 200, "res\\mesa.png", 100, 100, true);
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
	
}
