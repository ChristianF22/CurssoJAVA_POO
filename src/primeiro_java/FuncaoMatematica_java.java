package primeiro_java;

public class FuncaoMatematica_java {

	public static void main(String[] args) {
		double x = 8.0;
		double y = 16;
		double z = 60;
		double a, b, c;
		
		//Math.sqrt() para calcular a raiz quadrada de um número
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de: " + x + " = " + a);
		System.out.println("Raiz quadrada de: " + y + " = " + b);
		System.out.println("Raiz quadrada de 25 =  " + c);
		
		//Math.pow() para calcular a  potenciação de um número
		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + a);
		System.out.println(x + " elevado ao quadrado = " + b);
		System.out.println("5 elevado ao quadrado = " + c);
		
		//Math.pow() para calcular o valor absoluto
		a = Math.abs(y);
		b = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + a);
		System.out.println("Valor absoluto de " + z + " = " + b);
		
		

	}

}
