/*
19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia= new Scanner (System.in);

        System.out.print("Informe a 1º nota do aluno: ");
        double nota1 = leia.nextDouble();

        System.out.print("Informe a 2º nota do aluno: ");
        double nota2 = leia.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("\nMédia do aluno: %.2f \n" , media);

        if(media > 7.0){
            System.out.println("Parabêns pelo bom aproveitamento!");
        }
        else{
            System.out.println("Tente estudar mais na próxima");
        }

        leia.close();
    }
}