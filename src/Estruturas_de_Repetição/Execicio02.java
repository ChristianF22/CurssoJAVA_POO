package Estruturas_de_Repetição;

import java.util.Scanner;

public class Execicio02 {

	public static void main(String[] args) {
		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
		//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
		//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
		//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0,Alcool = 0, Gasolina = 0, Diesel = 0;
		
		
		System.out.println("Escolha umas da opções: 1.Alcool 2.Gasolina 3.Disel 4");
		opcao = sc.nextInt();

		while(opcao != 4) {
			opcao = sc.nextInt();
			if(opcao == 1) {
				Alcool += 1;
			}else if(opcao == 2) {
				Gasolina += 1;
			}else if(opcao == 3) {
			   Diesel += 1;
			}
		}
		
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		System.out.println("Muito Obrigado");
		
		
		sc.close();

	}

}
