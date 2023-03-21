package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);
	
		//Aumentar o valor do carro em 20%
		gol.atualizarValor(0.2);
		//exibir valor do carro
		System.out.println("Valor atualizado do carro com + 20%: " + gol.valor);
		
		//exibindo seguro
		double seguro = gol.seguro();
		
		System.out.println("Seguro do carro: " + seguro);
		
		//Exibir valor de parcela
		double valorP = gol.calcularParcela(seguro, 10);
		
		System.out.println("Valor de parcelas eh:" + valorP);
	
	
	
	}

}
