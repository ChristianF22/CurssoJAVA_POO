package Estruturas_de_Repetição;

import java.util.Scanner;

public class EstruturaRepetição_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int valor = sc.nextInt();
		
		int soma = 0;
		
		while( valor != 0){
			soma += valor;
			valor = sc.nextInt();
		}
		 
		System.out.println("O resultado da soma foi: " + soma);
		
		sc.close();

	}

}
