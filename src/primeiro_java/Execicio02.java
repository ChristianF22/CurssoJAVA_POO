package primeiro_java;

public class Execicio02 {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
		
		double x = 2.00;
		double w = 2;
		double y = 100.64;
		double z = 150.00;
		double a;
		double pi = 3.14159;
		double multi;
		
		a = Math.pow(x, w);
		multi = pi * a;
		System.out.println("O resultado foi: " + multi);
		
		y = Math.pow(y, w);
		multi = pi * y;
		System.out.printf("O resultado foi: %.4f%n ", multi);
		
		z = Math.pow(z, w);
		multi = pi * z;
		System.out.println("O resultado foi: " + multi);
		
	
	}

}
