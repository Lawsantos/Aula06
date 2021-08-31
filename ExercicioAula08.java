//    A mensagem Aluno aprovado, se a média alcançada for igual ou superior a sete;
  //  A mensagem Aluno reprovado, se a média for inferior a sete;
 //   A mensagem Aluno aprovado com louvores, se a média for igual a dez.

import java.util.Scanner;

class ExercícioAula08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double media = entrada.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		 media += entrada.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		 media += entrada.nextDouble();
		
		System.out.println("Digite sua quarta nota: ");
		 media += entrada.nextDouble();
		 double total = media / 4;
				
		System.out.println("Sua média é: " + total);
		
		if (total >= 7 && total <= 9) {
			
			System.out.println("Aluno aprovado!");
			
		}else if (total < 7) {
			System.out.println("Aluno reprovado!");

		}else if(total == 10.0){
			System.out.println("Aluno aprovado com louvores!");

		}
	}

}
