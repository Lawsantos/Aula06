package pacoteAula10;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner idades = new Scanner(System.in);
		
		int[] idadesPessoas = new int[10];
		int contador = 0;
		int[] maiorIdade = new int[10];	
		
		for (int i = 0; i < idadesPessoas.length; i++) {
			
			System.out.println("Digite a idade : ");
			
			idadesPessoas[i] = idades.nextInt();
						
			if (idadesPessoas[i] >= 18) {				
				
				maiorIdade[contador] = idadesPessoas[i];
				contador++;
				System.out.println(contador);
			}			
			
		}
		
		for (int i = 0; i < idadesPessoas.length; i++) {
			
			System.out.println("Idade: " + idadesPessoas[i] + " ");
						
		}
		
		System.out.println("Quantidade de pessoas maiores de idade: " + contador);

	}

}
