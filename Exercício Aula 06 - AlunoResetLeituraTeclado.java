package com.law.aula05;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		System.out.println("Sou aluno do CWI Reset. Me chamo: " + nome);
	
	}
} 
