/*
57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int salario, totalSalarioHomens = 0, totalSalarioMulheres = 0;

        boolean flag = true;

        while (flag) {
            System.out.print("Informe o valor do salário: ");
            salario = leia.nextInt();

            System.out.print("Informe o sexo do funcionário [F/M]: ");
            String sexo = leia.next();

            if (sexo.equals("M") || sexo.equals("m")) {
                totalSalarioHomens += salario;
            }
            else if (sexo.equals("F") || sexo.equals("f")) {
                totalSalarioMulheres += salario;
            }

            System.out.print("\nDeseja continuar inserindo dados? [S/N]: ");
            String continuar = leia.next();

            if (continuar.equals("N") || continuar.equals("n")) {
                flag = false;
            }
        }
        System.out.println("\n\nTotal pago aos homens: " + totalSalarioHomens);
        System.out.println("Total pago aos mulheres: " + totalSalarioMulheres);

        leia.close();
    }
}