import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int vetorNumeros[] = new int[5];
		int numeroTeste = 0;
		
		for (int valores = 0; valores < vetorNumeros.length; valores++) {
			
			System.out.println("Digite um numero: ");
		
			vetorNumeros[valores] = numero.nextInt();
			
			if(numeroTeste < vetorNumeros[valores]) {
				
				numeroTeste = vetorNumeros[valores];
				
			}
		}
		
		System.out.println("O maior número digitado foi " + numeroTeste);		
	}

}
