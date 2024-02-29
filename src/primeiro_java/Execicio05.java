package primeiro_java;

import java.util.Scanner;

public class Execicio05 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
        int valor1, valor2,nubperca1,nubperca2;
        double valorTotal,precoUnitario1,precoUnitario2;;
        
        Scanner sc = new Scanner(System.in);
        
        valor1 = sc.nextInt();
        nubperca1 = sc.nextInt();
        precoUnitario1 = sc.nextDouble();
        
        valor2 = sc.nextInt();
        nubperca2 = sc.nextInt();
        precoUnitario2 = sc.nextDouble();
        
        valorTotal = precoUnitario1 * nubperca1 +  precoUnitario2 * nubperca2;
        
        System.out.printf("Total a se pagar: R$%.2f%n", valorTotal);
        
        sc.close();
        		
	}

}
