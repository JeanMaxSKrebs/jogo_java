package controller;

import java.util.ArrayList;

import model.Parede;

public class paredeController {
	public static void main(String[] args) {
		Parede parede_1 = new Parede("externa", 100, 200, "res\\parede_externa.png", 100, 100, true);
		Parede parede_2 = new Parede("interna", 100, 300, "res\\parede_interna.png", 100, 100, true);
		
		setParedes(parede_1);
		setParedes(parede_2);
	}
	
	private static void setParedes(Parede parede) {
		Parede.setParedes(parede);
	}

	public static ArrayList<Parede> getParedes(){

		ArrayList<Parede> paredes = Parede.getParedes();
		
		return paredes;
	}
}
		

	
	
