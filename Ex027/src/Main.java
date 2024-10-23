/*
27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a 1º nota do aluno: ");
        double nota1 = leia.nextDouble();

        System.out.print("Informe a 2º nota do aluno: ");
        double nota2 = leia.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("\nMédia do aluno: %.2f \n" , media);

        if(media >= 7){
            System.out.println("APROVADO");
        }
        else if(media >= 5.0 && media <= 6.9){
            System.out.println("RECUPERAÇÃO");
        }
        else{
            System.out.println("REPROVADO");
        }

        leia.close();
    }
}