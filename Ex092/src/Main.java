/*
92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num1 = leia.nextInt();
        leia.close();

        ParOuImpar(num1);
    }
    public static void ParOuImpar(int num1) {
        String resultado = (num1 % 2 == 0)? "Número par" : "Número impar";
        System.out.println(resultado);
    }
}