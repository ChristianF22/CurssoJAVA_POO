package ExeciciosVetoresJava;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor 

 */

public class ExecioVetor03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vet = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("Valores: ");
        for(int i = 0; i < n; i ++){
            System.out.println(vet[i]);
        }
       
        double soma = 0;
        for(int i =0; i < n; i++){
            soma = soma + vet[i];
        }

        double media = soma / n;

        System.out.printf("Soma: %.2f%n" , soma);
        System.out.printf("Media: %.2f%n", media);
    }
    
}
