import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner digite = new Scanner(System.in);
		
		System.out.print("Insira o valor da sua hora trabalhada: R$ ");
		double slPorHora = digite.nextDouble();
		
		System.out.print("Insira quantas horas você trabalhou esse mês: ");
		double hTrabMes = digite.nextDouble();
		
		double totSal = slPorHora * hTrabMes;
		System.out.printf("O total de seu salário mensal foi de: R$ %.2f", totSal);

	}

}
