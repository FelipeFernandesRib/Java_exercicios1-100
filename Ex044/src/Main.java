/*
44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
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

        while(valorInicial <= valorFinal) {
            System.out.print(valorInicial + " ");
            valorInicial += incremento;
        }

        leia.close();
    }
}