/*Faça um programa que, imprima uma tabela,
relacionando alturas em incrementos de 5 cm e o
suposto peso ideal da pessoa. Comece a altura a
partir de 1,50m até 2,00m.*/

class Altura{
	public static void main(String[] args){
		double altura = 1.50;
		double pesoM = 0;
		double pesoH = 0;
		for(altura = 1.50; altura < 2.01; altura = altura + 0.05){
			pesoH = (72.7 * altura) - 58;
			pesoH = (62.1 * altura) - 42.7;
			System.out.println("Peso ideal para a altura de: " + altura  + " Masculino: "+ pesoH + " Feminino: " + pesoM);
		}	
	}
}