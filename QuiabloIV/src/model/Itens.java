package model;

public abstract class Itens {
	
	public static int numSeque;
	
	public Itens(int numSeque){
		this.setNumSeque(numSeque);
	}
	
	public int getNumSeque() {
		return numSeque;
	}
	
	public void setNumSeque(int numSeque) {
		Itens.numSeque = numSeque + 1;
	}
	public String toString() {
		return "numSeque: " + numSeque;
	}
	
}
