import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		
		boolean valorValido = true;
		
		while (valorValido) {	
			
			System.out.println("Digite um número de 0 a 10: ");
			
			int numero = entrada.nextInt();
			
			if (numero < 0 || numero > 10) {
				System.out.println("Valor inválido");
				continue;
				
			}else {
				
				System.out.println("Seu número é: " + numero);
				valorValido = false;
			}			
			
		}	
		
	}

}
