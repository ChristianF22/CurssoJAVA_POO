package VETORES_JAVA;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor
         Em seguida, mostrar a altura média dessas pessoas.
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /*Criando o arra
        -y */
        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }
        
        // calculando a altura media
        double sum = 0.0;
        for(int i= 0; i < n; i++){
            sum += vect[i];
        }
        
        double avg = sum / n;

        System.out.printf("O valor da altura media e: %.2f%n" , avg);
        
        sc.close();
    } 
}
