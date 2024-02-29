package Execicios_LP;

import java.util.Scanner;

public class Execicio01 {

	public static void main(String[] args) {
		// . Tendo	 como	 entrada	 a	 altura	 e	 o	 sexo	 (codificado	 da	 seguinte	 forma:	
	    //1:feminino	 	 2:masculino)	 de	 uma	 pessoa,	 construa	 um	 programa	 que	
	   //calcule	e	imprima	seu	peso	ideal,	utilizando	as	seguintes	
		
		int codigo = 0;
		double Altura, resultado = 0;
		
		Scanner sc = new Scanner (System.in);
		
		codigo = sc.nextInt();
		Altura = sc.nextDouble();
		
		if(codigo == 1) {
			resultado = (72.7 * Altura) - 58;
		}else if(codigo == 2) {
			resultado = (62.1 * Altura) - 44.7;
		}else {
			System.out.println("Valor invalido");
		}
		
		System.out.println("Codigo: " + codigo);
		System.out.printf("Altura: %.2f%n",resultado);
		
		sc.close();
	}

}
