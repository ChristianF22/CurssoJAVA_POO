package primeiro_java;

import java.util.Locale;
import java.util.Scanner;

public class Execicio04 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nub;
		double  horasTrabalhadas, valor, salario;
		String nome;
		
		nome = sc.nextLine();
		nub = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valor = sc.nextDouble();
		
		salario = horasTrabalhadas * valor;
		
		System.out.println("Nome do funcionario: " + nome);
		System.out.println("Numero do funcionario: " + nub);
		System.out.printf("Salario: U$%.2f%n ", salario);
		
		
		sc.close();
	
		
	}

}
