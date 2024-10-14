/*
7) Crie um algoritmo que leia um número real e
mostre na tela o seu dobro e a sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um número real: ");
        float num = leia.nextFloat();

        System.out.println("O dobro de " +  num + " é " + num*2);
        System.out.println("A terça parte de " + num + " é " + num/3 );
    }
}