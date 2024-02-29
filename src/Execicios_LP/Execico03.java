package Execicios_LP;

import java.util.Scanner;

public class Execico03 {

	public static void main(String[] args) {
		// Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida	
		//pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as	
		//seguintes	mensagens:	
		
		
		Scanner sc = new Scanner(System.in);
		
		int senhaVerdadeira = 1234,senha = 0 ;
		String nome;
		
		nome = sc.nextLine();
		senha = sc.nextInt();
		
	     System.out.println("Nome: " + nome);
		
		if(senha == senhaVerdadeira) {
			System.out.println("Acesso Permitido");
		}else {
			System.out.println("Acesso Negado");
		}
		
		
		
		sc.close();

	}

}
