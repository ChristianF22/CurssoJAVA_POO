package primeiro_java;

import java.util.Scanner;

public class Execicio06 {

	public static void main(String[] args) {
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		double A, B, C;
		double AreaTrianguloRatangulo, AreaCirculoRaio, AreaTrapezio, AreaQuadrado, AreaRetangulo;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		AreaTrianguloRatangulo = A * C/2 ;
		AreaCirculoRaio = pi * C * C;
		AreaTrapezio = (A + B)*C/2;
		AreaQuadrado = B * B;
		AreaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n" ,AreaTrianguloRatangulo );
		System.out.printf("CIRCULO: %.3f%n" ,AreaCirculoRaio );
		System.out.printf("TRAPEZIO: %.3f%n" ,AreaTrapezio );
		System.out.printf("QUADRADO: %.3f%n" ,AreaQuadrado );
		System.out.printf("RETANGULO: %.3f%n" , AreaRetangulo );
		
		sc.close();		
		
		

	}

}
