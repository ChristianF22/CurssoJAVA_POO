package primeiro_java;

public class Execicio03 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
       
		int nub1 = 5;
		int nub2 = 6;
		int nub3 = 7;
		int nub4 = 8;
		int nub5 = -7;
		int result;
		
		result = nub1 * nub2 - nub3 * nub4;
		System.out.println("O resultado da operação foi: " + result);
		
		result = nub1 * nub2 - nub5 * nub4;
		System.out.println("O resultado da operação foi: " + result);
		
		
	}

}
