package model;

public class Bolso {
    private Itens item;

    public void adicionarItem(Itens item) {
        this.item = item;
    }

    public Itens getItem() {
        return item;
    }
    
    public void usarItem() {
        if (item != null) {
            System.out.println("Usando item do bolso: " + item);
            item = null; // Remove o item após o uso
        } else {
            System.out.println("Nenhum item no bolso para usar.");
        }
    }
}