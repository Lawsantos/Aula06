import java.util.Scanner;

public class aula08_02 {

	public static void main(String[] args) {

		Scanner diaDaSemana = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");

		int dia = diaDaSemana.nextInt();

		switch (dia) {
			case 1: {
	
				System.out.println("Domingo");
			}
			break;
			case 2: {
	
				System.out.println("Segunda");
			}
			break;
			case 3: {
	
				System.out.println("Terca");
			}
			break;
			case 4: {
	
				System.out.println("Quarta");
			}
			break;
			case 5: {
	
				System.out.println("Quinta");
			}
			break;
			case 6: {
	
				System.out.println("Sexta");
			}
			break;
			case 7: {
	
				System.out.println("Sábado");
	
			}
			break;
			default: {
				System.out.println("Valor inválido : " + dia);
			
			}
			break;
		}

	}
		
}
