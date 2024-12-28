/*
97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);

       System.out.print("Digite  primeiro valor: ");
       double num1 = leia.nextDouble();

       System.out.print("Digite o segundo valor: ");
       double num2 = leia.nextDouble();

       System.out.print("Digite o terceiro valor: ");
       double num3 = leia.nextDouble();
       leia.close();

       String resultado =  Maior(num1, num2, num3);

        System.out.println("\nResultado:\n" + resultado);
    }
    public static String Maior (double n1, double n2, double n3) {
        if(n1 == n2 && n1 == n3) {
            return "Os três números são iguais: " + n1;
        }
        if(n1 == n2 && n1 > n3) {
            return "Os dois primeiros números informados são iguais: " + n1;
        }
        if (n1 > n2 && n1 == n3) {
            return "O primeiro número e o terceiro são iguais: " + n1 ;
        }
        if(n2 > n1 && n2 == n3){
            return "O segundo e o terceiro número são iguais: " + n2;
        }

        if(n1 > n2 && n1 > n3){return "Maior valor: " + n1;}
        else if (n2 > n1 && n2 > n3){return "Maior valor: " + n2;}
        else { return "Maior valor: " + n3;}
    }
}