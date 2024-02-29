package EstruturaCondicional_java;

import java.util.Scanner;

public class Condicional_ternaria {

	public static void main(String[] args) {
		// Expressao condicional ternaria
		
		Scanner sc = new Scanner (System.in);
		
		double preco, desconto, valor_final;
		
		preco = sc.nextDouble();
		
		desconto = (preco <= 20.0) ? preco * 0.05 : preco * 0.12;
		
		valor_final = preco - desconto;
		
		System.out.println("Valor do produto: R$" + preco);
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Valor a pagar: R$" + valor_final);
		
		
      
		sc.close();
	}

}
