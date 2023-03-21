package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	
	//aumentar o valor
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
		
	}
	
	//Criar um metodo que calcula e retorna o valor do seguro do carro
	//Seguro do carro é baseado no valor, 5% do valor do carro
	
	double seguro() {
		double valorSeguro = (valor * 5) / 100;
		
		return valorSeguro;
	}
	
	//criar um metodo que recebe a quantidade de parcelas, calcula e retorna o valor da parcela do seguro
	
	double calcularParcela(double seguro, int numParcelas) {
		double valorParcela = (seguro / numParcelas);
		
		return valorParcela;
		
	}
	
	
}