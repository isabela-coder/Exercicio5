
package exercicio5;

import java.util.Scanner;


public class Exercicio5 {

    
    public static void main(String[] args) {
        
        float salario;
        float salminimo;
        double quantsalarios;
        
        Scanner leia = new Scanner(System.in);
         System.out.println("Digite o seu salario");
        salario = Float.parseFloat(leia.nextLine());
        System.out.println("Digite o  salario minimo");
        salminimo = Float.parseFloat(leia.nextLine());
        quantsalarios = (salario/salminimo);
        System.out.println(quantsalarios);
        
        
        
        
        
    }
    
}
