/*
34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida

Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura)
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a sua altura, em metros (use vírgula, não ponto): ");
        double altura = leia.nextDouble();

        System.out.print("Informe a sua peso: ");
        double peso = leia.nextDouble();

        double imc = peso/(altura*altura);

        System.out.printf("IMC: %.2f ", imc);

        if(imc < 18.5){
            System.out.print("Abaixo do peso");
        }
        else if(imc < 25){
            System.out.print("Peso ideal");
        }
        else if(imc < 30){
            System.out.print("Sobrepeso");
        }
        else if(imc < 35){
            System.out.print("Obesidade");
        }
        else if(imc < 40){
            System.out.print("Obesidade mórbida");
        }

        leia.close();
    }
}