package Execicios_LP;

import java.util.Scanner;

public class Excicio05 {

	public static void main(String[] args) {
		// As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma	
		//dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um	
		//programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o	
		//valor	total	da	compra.
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		double resultado = 0;
		
		quantidade = sc.nextInt();
		
		if( quantidade < 12) {
			
			resultado = quantidade * 0.30;
		}else if(quantidade > 12) {
			resultado = quantidade * 0.25;
		}else {
			System.out.println("ERRO");
		}
		
		
		System.out.println("Quantidade: " + quantidade);
		System.out.printf("Total: R$%.2f%n" , resultado);
		
		sc.close();

	}

}
