/*
29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = leia.nextLine();

        System.out.print("Informe o salário do funcionário: ");
        double salario = leia.nextDouble();

        System.out.print("Informe a quantos anos ele trabalha na empresa: ");
        int tempoDeEmpresa = leia.nextInt();

        if(tempoDeEmpresa <= 3){
            System.out.print("Seu novo salário será R$: " + salario* 1.03);
        }
        else if (tempoDeEmpresa <= 10){
            System.out.print("Seu novo salário será R$: " + salario* 1.125);
        }
        else {
            System.out.print("Seu novo salário será R$: " + salario* 1.20);
        }

        leia.close();
    }
}