import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner digite = new Scanner(System.in);
		
		System.out.print("Insira o valor da sua hora trabalhada: R$ ");
		double slPorHora = digite.nextDouble();
		
		System.out.print("Insira quantas horas voc� trabalhou esse m�s: ");
		double hTrabMes = digite.nextDouble();
		
		double totSal = slPorHora * hTrabMes;
		System.out.printf("O total de seu sal�rio mensal foi de: R$ %.2f", totSal);

	}

}
