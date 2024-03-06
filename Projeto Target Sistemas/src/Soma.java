
public class Soma {
	
	/*1) Observe o trecho de código abaixo:

		int INDICE = 13, SOMA = 0, K = 0;

		enquanto K < INDICE faça

		{

		K = K + 1;

		SOMA = SOMA + K;

		}

		imprimir(SOMA);



		Ao final do processamento, qual será o valor da variável SOMA?/*/
		
	
	private int indice = 13; 
	private int soma = 0; 
	private int K = 0; 
	
	
	public int Somar() {
		while ( K < indice) {
			K = K + 1;
			soma = soma + K; 
		}
		return soma;
	}
		
}
