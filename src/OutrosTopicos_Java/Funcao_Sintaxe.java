package OutrosTopicos_Java;

import java.util.Scanner;

public class Funcao_Sintaxe {
    // Funções Sintaxe
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

         int maiorNunber = max(a, b, c);

         showResult(maiorNunber);

        sc.close();
    }
    
    // Criando uma função em Java max()
    public static int max(int x, int y, int z){
       int aux;
       if(x > y && x > z){
         aux = x;
       }else if(y > x && y> z){
         aux = y;
       }else{
         aux = z;
       }

       return aux;
    }

    // Criando a função showResult()
    public static void showResult(int value){
      System.out.println("Maior Numero: " + value);
    }
}
