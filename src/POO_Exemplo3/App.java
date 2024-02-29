package POO_Exemplo3;

import java.util.Locale;
import java.util.Scanner;

import POO_Exemplo3.entities.Retangulo;

public class App {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valor,valor2,valor3;
        
        System.out.println("Enter rectangle width and height: ");

        Retangulo retangulo = new Retangulo();
        
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        valor = retangulo.area();
        valor2 = retangulo.perimeter();
        valor3 = retangulo.diagonal();
        

        System.out.printf("AREA: %.2f%n" , valor);
        System.out.printf("PERIMETRO: %.2f%n " , valor2);
        System.out.printf("DIAGONAL: %.2f" , valor3);

        sc.close();
    }
}
