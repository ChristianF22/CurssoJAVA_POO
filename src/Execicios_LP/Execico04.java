package Execicios_LP;

import java.util.Scanner;

public class Execico04 {

	public static void main(String[] args) {
		// Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e	
		//escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano	
		//(não	é	necessário	considerar	o	mês	em	que	ela	nasceu).

		Scanner sc = new Scanner(System.in);
		
		int ano_nascimento, idade;
		String nome;
		
		nome = sc.nextLine();
		ano_nascimento = sc.nextInt();
		idade = 2024 - ano_nascimento;
		
		if(idade >= 16) {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nVc pode votar");
		}else {
			System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nVc pode não votar");
		}
		
		
		
		
		
		
		sc.close();
	}

}
