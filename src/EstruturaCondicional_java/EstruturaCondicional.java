package EstruturaCondicional_java;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom Dia!");
		}else if(hora < 18) {
			System.out.println("Boa Tarde!");
		}else if(hora >= 18){
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Erro");
		}
		
		sc.close();
	}

}
