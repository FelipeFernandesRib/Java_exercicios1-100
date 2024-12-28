/*
100) Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = leia.nextDouble();
        leia.close();

        double resultado = Media(nota1, nota2);
        String situacaoAluno = Situacao(resultado);

        System.out.printf("\nMédia: %.2f\nSituação: %s\n", resultado, situacaoAluno);
    }
    public static double Media(double n1, double n2) {
        return (n1 + n2) / 2;
    }
    public static String Situacao(double notaFinal) {
        if(notaFinal >= 7){return "APROVADO";}
        else if(notaFinal >= 4){return "RECUPERAÇÃO";}
        else{return "REPROVADO";}
    }
}