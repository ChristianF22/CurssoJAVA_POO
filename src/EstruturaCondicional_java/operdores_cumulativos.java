package EstruturaCondicional_java;

import java.util.Locale;
import java.util.Scanner;

public class operdores_cumulativos {

	public static void main(String[] args) {
		
		// Operadores de atribuição cumulativa
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos minutos vc usou de internet?");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta: R$%.2f%n", conta);
		
		sc.close();
		

	}

}
