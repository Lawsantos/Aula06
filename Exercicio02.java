import java.util.Iterator;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada01 = new Scanner(System.in);
		boolean segundoNumeroMenor = true;
		int segNum = 0;
		
		System.out.println("Digite o primeiro valor: ");
		int num01 = entrada01.nextInt();
		
		do {				
			
			System.out.println("Digite o segundo valor: ");
			int num02 = entrada01.nextInt();
			
			if(num01 < num02) {				
				
				segundoNumeroMenor = false;
				segNum = num02;
				
			}
		}while (segundoNumeroMenor);
		
		for (int i = num01; i < segNum; ++i) {
			
			if(segNum == num01 + 1) {
				
				System.out.println("Não há intervalo entre estes números! ");
				break;
			}
			
			System.out.println(i);			
			
		}
		
	}

}
