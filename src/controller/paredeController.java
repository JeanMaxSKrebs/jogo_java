package controller;

import java.util.ArrayList;

import model.Parede;

public class paredeController {
	public static void main(String[] args) {
		Parede rodape_1 = new Parede("interna", 30, 30, "res\\parede_interna.png", 10, 970, true);
		Parede parede_interna_1 = new Parede("interna", 230, 30, "res\\parede_interna90.png", 450, 30, true);
		Parede parede_interna_2 = new Parede("interna", 700, 30, "res\\parede_interna90.png", 450, 30, true);
		Parede parede_interna_3 = new Parede("interna", 400, 450, "res\\parede_interna.png", 30, 450, true);
		Parede parede_interna_4 = new Parede("interna", 150, 450, "res\\parede_interna.png", 30, 125, true);
		Parede parede_externa_0 = new Parede("externa", 0, 0, "res\\parede_externa.png", 30, 500, true);
		Parede parede_externa_1 = new Parede("externa", 500, 0, "res\\parede_externa.png", 30, 500, true);
		Parede parede_externa_2 = new Parede("externa", 970, 0, "res\\parede_externa90.png", 300, 30, true);
		Parede parede_externa_3 = new Parede("externa", 970, 300, "res\\parede_externa90.png", 320, 30, true);
		Parede parede_externa_4 = new Parede("externa", 0, 0, "res\\parede_externa90.png", 300, 30, true);
		Parede parede_externa_5 = new Parede("externa", 0, 300, "res\\parede_externa90.png", 320, 30, true);
		Parede parede_externa_6 = new Parede("externa", 0, 620, "res\\parede_externa.png", 30, 450, true);
		Parede parede_externa_7 = new Parede("externa", 620, 620, "res\\parede_externa.png", 30, 450, true);

		
//		int qtdParedes = Parede.getParedes().size();
//		System.out.println(qtdParedes);
//		for(int i=0; i < qtdParedes; i++) {
//			Parede s = "parede_externa_"+i
//					
//			setParedes(s);
//		}
		setParedes(rodape_1);
		setParedes(parede_interna_1);
		setParedes(parede_interna_2);
		setParedes(parede_interna_3);
		setParedes(parede_interna_4);
		setParedes(parede_externa_0);
		setParedes(parede_externa_1);
		setParedes(parede_externa_2);
		setParedes(parede_externa_3);
		setParedes(parede_externa_4);
		setParedes(parede_externa_5);
		setParedes(parede_externa_6);
		setParedes(parede_externa_7);

	}
	
	private static void setParedes(Parede parede) {
		Parede.setParedes(parede);
	}

	public static ArrayList<Parede> getParedes(){

		ArrayList<Parede> paredes = Parede.getParedes();
		
		return paredes;
	}
}
		

	
	
