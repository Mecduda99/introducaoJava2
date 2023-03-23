package br.com.fiap.exercicio;

public class Aluno {
	//atributos
	String rm;
	String nome;
	double cp1, cp2, cp3, challenge, global; 
	
	//metodos
	double calcularMediaCheckpoint() {
		double mediaCp = (cp1 + cp2 + cp3)/3;
		return mediaCp;
	}

	double calcularMediaSemestre() {
		// CP 20%, Challenge 20%, Global 60%
		double mCp = calcularMediaCheckpoint();
		double mediaSemestral = (mCp*0.2) + (challenge*0.2) + (global* 0.6);
		return mediaSemestral;
	}
	
}
