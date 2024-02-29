package EstruturaCondicional_java;

import java.util.Scanner;

public class Execicio01 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		
		int NubInt;
		System.out.println("Digite um numero: ");
		NubInt = sc.nextInt();
		
		if (NubInt >= 0) {
			System.out.println("Não Negativo");
		}else {
			System.out.println("Negativo");
		}
		

	}

}
