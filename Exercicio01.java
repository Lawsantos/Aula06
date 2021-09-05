package pacoteAula10;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner valores = new Scanner(System.in);
		
		int[] numerosVetor = new int[5];
		
		int[] numerosQuadrado = new int[5];
		
		for (int i = 0; i < numerosVetor.length; i++) {
			
			System.out.println("Digite um valor: ");
			
			int numeros = valores.nextInt();
			
			numerosVetor[i] = numeros;
			numerosQuadrado[i] = numeros * 2;
			
		}				
		
		for (int i = 0; i < numerosVetor.length; i++) {
			
			System.out.print("Valor: " +  numerosVetor[i] + " Valor ao quadrado: ");
			System.out.println("Valor: " +  numerosQuadrado[i]);
		}

	}

}
