package EstruturaCondicional_java;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		//Estrutura Switch Case
		
		Scanner sc = new Scanner (System.in);
		
		int dias_sema;
		
		System.out.println("Escolha um dia da sema de 1 a 7: ");
		dias_sema = sc.nextInt();
		
		switch(dias_sema) {
		  case 1:
			 System.out.println("Domingo");
			 break;
		  case 2:
			  System.out.println("Segunda-Feira");
			  break;
		  case 3:
			  System.out.println("Terça-Feira");
			  break;
		  case 4:
			  System.out.println("Quarta-Feira");
			  break;
		  case 5:
			  System.out.println("Quinta-Feira");
			  break;
		  case 6:
			  System.out.println("Sexta-Feira");
			  break;
		  case 7:
			  System.out.println("Sabado");
			  break;
		 default:
			 System.out.println("Dia da semana: valor invalido");
		}
		
		sc.close();

	}

}
