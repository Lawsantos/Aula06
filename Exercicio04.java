import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner digite = new Scanner(System.in);
		
		int numero = digite.nextInt();
		
		System.out.println("Tabuada do "+ numero);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero + " * " + i + " = " + numero * i);
		}		
		
	}

}
