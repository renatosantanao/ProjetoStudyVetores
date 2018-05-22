package exercicio01;

import java.util.Random;

public class AulaVetor {
	public static void main (String[] args) {
		
		Random geradorNotas = new Random();
		
		int numeroAlunos = 10;
		int[] notasAluno = new int[numeroAlunos];
		
		for (int i = 0; i < notasAluno.length ; ++i) {
			
			notasAluno[i] = geradorNotas.nextInt(6);
			
			System.out.println("A nota do " + (1+i) + " ªAluno");
			System.out.println("-> " + notasAluno[i]);
		}
		
	}
}
