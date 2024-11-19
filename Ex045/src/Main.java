/*
45) O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.
*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valorInicial = leia.nextInt();

        System.out.print("Digite o último valor: ");
        int valorFinal = leia.nextInt();

        System.out.print("Digite o valor do incremento: ");
        int incremento = leia.nextInt();

        if(valorInicial <= valorFinal) {
            while (valorInicial <= valorFinal) {
                System.out.print(valorInicial + " ");
                valorInicial += incremento;
            }
        }
        else {
            while (valorFinal <= valorInicial) {
                System.out.print(valorInicial + " ");
                valorInicial -= incremento;
            }
        }
        leia.close();
    }
}