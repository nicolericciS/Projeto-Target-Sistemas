import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		
		
		/* Questão 01*/
		Soma somador = new Soma(); 
		
		/* Questão 02*/
		Fibonacci fibonacci = new Fibonacci(); 
		int numero; 
		
		/* Questão 05*/
		InversaoString inversao = new InversaoString(); 
		
		System.out.println("A resposta da Questão 1 é: " + somador.Somar());
	
		
		System.out.println("Questão 2:\n Insira um número inteiro: " );
		numero = teclado.nextInt(); 
		
		fibonacci.Sequencia(numero); 
		
		
		System.out.println("A palavra Nicole invertida é: " + inversao.Inverter());
	}

}
