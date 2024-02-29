package EstruturaCondicional_java;

import java.util.Scanner;

public class Execicio02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner (System.in);
		int Nub;
		System.out.println("Digite um numero: ");
		Nub = sc.nextInt();
		
		if(Nub % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
      
		sc.close();
	}

}
