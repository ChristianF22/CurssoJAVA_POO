package EstruturaCondicional_java;

import java.util.Scanner;

public class Execicio06 {

	public static void main(String[] args) {
		//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

		Scanner sc = new Scanner(System.in);
		
		double salario, total;
		
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Insento dos impostos");
		}else if(salario <= 3000.00) {
			total = (salario - 2000.00) * 0.08;
			System.out.printf("Voce pagara R$%.2f%n de imposto", total);
		}else if(salario <= 4500.00) {
			total = (salario - 4500.0) * 0.18 + 1500 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Voce pagara R$%.2f%n de imposto", total);
		}else {
			System.out.println("ERRO");
		}
		
		sc.close();
	}

}
