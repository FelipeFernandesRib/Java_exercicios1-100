/*
37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%

- Homens
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%
*/

import java.util.Scanner;
public class Main {
    public static double salarioAtualizado;
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o seu salário atual R$: ");
        double salarioAtual = leia.nextDouble();

        System.out.print("Informe o seu gênero [M/F]: ");
        String genero = leia.next();

        System.out.print("Informe há quantos anos você trabalha na empresa: ");
        int anosDeEmpresa = leia.nextInt();

        if (genero.equalsIgnoreCase("F")){
            if (anosDeEmpresa < 15){
                salarioAtualizado = salarioAtual * 1.05;
            }
            else if (anosDeEmpresa <= 20){
                salarioAtualizado = salarioAtual * 1.12;
            }
            else{
                salarioAtualizado = salarioAtual * 1.23;
            }
        }
        else if (genero.equalsIgnoreCase("M")){
            if (anosDeEmpresa < 20){
                salarioAtualizado = salarioAtual * 1.03;
            }
            else if (anosDeEmpresa <= 30){
                salarioAtualizado = salarioAtual * 1.13;
            }
            else{
                salarioAtualizado = salarioAtual * 1.25;
            }
        }
        else{
            System.out.print("Gênero inválido! O gênero deve ser 'M' ou 'F'.");
            leia.close();
            return;
        }

        System.out.printf("Novo salário R$: %.2f", salarioAtualizado);

        leia.close();
    }
}