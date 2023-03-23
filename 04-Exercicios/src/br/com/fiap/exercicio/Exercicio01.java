package br.com.fiap.exercicio;
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		//Instanciar o objeto para ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//instanciar o aluno
		Aluno aluno1 = new Aluno();
		
		//Ler o nome do Aluno
		System.out.println("Digite o seu nome: ");
		aluno1.nome = leitor.next();
		
		//Ler notas do aluno
		System.out.println("Digite sua nota de Checkpoint 1: ");
		aluno1.cp1 = leitor.nextDouble();
		
		System.out.println("Digite sua nota de Checkpoint 2: ");
		aluno1.cp2 = leitor.nextDouble();
		
		System.out.println("Digite sua nota de Checkpoint 3: ");
		aluno1.cp3 = leitor.nextDouble();
		
		System.out.println("Digite sua nota de Challenge: ");
		aluno1.challenge = leitor.nextDouble();
		
		System.out.println("Digite sua nota de global solution: ");
		aluno1.global = leitor.nextDouble();
		
		//Calcular media semestral
		aluno1.calcularMediaCheckpoint();
		double mediaS = aluno1.calcularMediaSemestre();
		
		//Exibir nome e media do aluninho
		System.out.println(aluno1.nome + " sua média é: " + mediaS);
		
		
		
		
	}

}
