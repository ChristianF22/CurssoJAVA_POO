package Execicios_LP;

import java.util.Scanner;

public class Execico02 {

	public static void main(String[] args) {
		// . Escreva	um	programa	para	ler	o	número	de	lados	de	um	polígono	regular	
		//e	a	medida	do	lado	(em	cm).	Calcular	e	imprimir	o	seguinte:
		
		 Scanner sc = new Scanner(System.in);
		int valor1,valor2, codigo = 0;
		double resultado = 0;
		
		codigo = sc.nextInt();
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if(codigo == 3) {
			resultado = valor1 * valor2 / 2;
		   System.out.println("O codigo: " + codigo + " , reusltado da area do triangulo: " + resultado + " cm");
		}else if(codigo == 4) {
			resultado = valor1 * valor1;
			System.out.println("O codigo: " + codigo + " , reusltado da area do quadrado: " + resultado + " cm");
		}else if(codigo == 5) {
			resultado = 5 * valor1 * valor2;
			System.out.println("O codigo: " + codigo + " , reusltado da area do pentagono: " + resultado + " cm");
		}else {
			System.out.println("Erro nos valores");
		}
       
		sc.close();
	}

}
