package POO_Exemplo4;

import java.util.Locale;
import java.util.Scanner;

import POO_Exemplo4.entities.Funcionario;

public class App {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario salario = new Funcionario();

        System.out.print("Name: ");
        salario.name = sc.nextLine();
        System.out.print("Gross salary: ");
        salario.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salario.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + salario);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        salario.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + salario);
        
        sc.close();
    }
}
