package com.law.aula05;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é:" + nomeCompleto);
		
	}

}
