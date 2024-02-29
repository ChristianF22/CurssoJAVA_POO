package Estruturas_de_Repetição;

import java.util.Scanner;

public class Execicio01 {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner sc = new Scanner(System.in);
		
		int tentativa= 0,tentativas_maximas = 4,senha, senhaCorreta = 2002;
		
	
		while(tentativa < tentativas_maximas) {
			
			senha = sc.nextInt();
			
			if(senha == senhaCorreta) {
				System.out.println("Acesso Permitido");
			}else {
				System.out.println("Senha Invalida. Numero de tentativas que resta: " + tentativa);
				tentativa +=1;
			}
		}
		
		sc.close();

	}

}
