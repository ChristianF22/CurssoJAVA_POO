package POO_JAVA;

import java.util.Locale;
import java.util.Scanner;
import POO_JAVA.entidades.Triangle;

public class Problema_sem_POO extends Triangle{
    public static void main(String [] args){
        // RESOLVENDO UM PORBLEMA SEM ORIENTAÇÃO A OBJETOS
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        //FORMULA PARA CALCULAR AREA DO TRIANGULO NO VALOR DE X E Y:
        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
           System.out.println("Maior area: X");
        }else if(areaY > areaX){
            System.out.println("Maior area: Y ");
        }else{
            System.out.println("Erro no programa");
        }

        sc.close();

    }
}
