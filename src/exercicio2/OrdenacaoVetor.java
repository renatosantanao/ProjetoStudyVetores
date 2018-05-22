package exercicio2;

public class OrdenacaoVetor {

	public static void main(String[] args) {
		
		int[] vetor = {1,2, 6, 9, 5};
		int aux;
		Boolean controle;
		int contadorOrdenacao = 0;
		
		for( int x = 0; x < vetor.length; ++x ) {
			
			controle = true;
			
			for( int y = 0; y < (vetor.length -1); ++y) {
				
				if( vetor[ y ] > vetor[ y + 1 ] ) {
					
					aux = vetor[ y ];
					vetor[ y ]= vetor[ y + 1 ];
					vetor[ y + 1 ] = aux;
					controle = false;
					contadorOrdenacao =  x + 1;
					
				}
			}
			if (controle) {
				break;
				
			}
			
		}
		
		System.out.println("Combinação, utilizada "+ Integer.toString(contadorOrdenacao) + " veze(s)");
		
		for (int i = 0; i < vetor.length ; ++i) {
			
			System.out.println("vetores: " + vetor[i]);
		}

	}

}
