package model;

import java.util.*;

public class Futebol {
	public static ArrayList<Jogador> JogaFut = new ArrayList<>();

	public Futebol(ArrayList<Jogador> jogaFut) {
		super();
		this.setJogaFut(jogaFut);
	}

	public ArrayList<Jogador> getJogaFut() {
		return JogaFut;
	}
	
	public void setJogaFut(ArrayList<Jogador> jogaFut) {
		JogaFut = jogaFut;
	}
	
    public void adicionarJogador(Jogador jogador) {
        JogaFut.add(jogador);
    }

	@Override 
	public String toString() {
		return "Futebol [JogaFut=" + JogaFut + "]";
	}	
	 
}
