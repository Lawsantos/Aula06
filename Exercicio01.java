import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		
		boolean valorValido = true;
		
		while (valorValido) {	
			
			System.out.println("Digite um n�mero de 0 a 10: ");
			
			int numero = entrada.nextInt();
			
			if (numero < 0 || numero > 10) {
				System.out.println("Valor inv�lido");
				continue;
				
			}else {
				
				System.out.println("Seu n�mero �: " + numero);
				valorValido = false;
			}			
			
		}	
		
	}

}
