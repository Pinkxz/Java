package appli;
import java.util.ArrayList;
import java.util.List;

import model.*;
class Personagem {
    private String nome;
    private List<Bolso> bolsos;

    public Personagem(String nome) {
        this.nome = nome;
        this.bolsos = new ArrayList<>();

        // Inicializa três bolsos
        for (int i = 0; i < 3; i++) {
            bolsos.add(new Bolso());
        }
    }
    
    public void colocarItemNoBolso(int bolsoIndex, Itens item) {
        if (bolsoIndex >= 0 && bolsoIndex < bolsos.size()) {
            bolsos.get(bolsoIndex).adicionarItem(item);
            System.out.println("Item colocado no bolso " + bolsoIndex + ": " + item);
        } else {
            System.out.println("Índice de bolso inválido.");
        }
    }

    public void mostrarItensNoCinto() {
        System.out.println("Itens no cinto de " + nome + ":");
        for (int i = 0; i < bolsos.size(); i++) {
        	Itens item = bolsos.get(i).getItem();
            System.out.println("Bolso " + i + ": " + (item != null ? item.toString() : "Vazio"));
        }
    }
    
    public void usarItemNoBolso(int bolsoIndex) {
        if (bolsoIndex >= 0 && bolsoIndex < bolsos.size()) {
            bolsos.get(bolsoIndex).usarItem();
        } else {
            System.out.println("Índice de bolso inválido.");
        }
    }

    public static void main(String[] args) {
        Personagem jogador = new Personagem("Herói");

        FabricadeItens fabrica = new FabricadeItens();

        ItemComum itemComum = fabrica.getItemComum(Itens.numSeque, 000,"Espada Comum", "Afiada", "Leve");
        ItemRaro itemRaro = fabrica.getItemRaro(Itens.numSeque, 001, "Armadura Rara", "Resistente", "Elegante", "Mágica");

        jogador.colocarItemNoBolso(0, itemComum);
        jogador.colocarItemNoBolso(1, itemRaro);

        jogador.mostrarItensNoCinto();

        jogador.usarItemNoBolso(0);
        jogador.mostrarItensNoCinto();
    }
}
