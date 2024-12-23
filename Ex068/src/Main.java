/*
68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantMulheres = 0, quantHomeisComMaisDe100Kg = 0;
        double mediaPesoMulheres = 0, maiorPesoEntreHomens = Integer.MIN_VALUE;

        for(int i = 0; i < 8; i++){
            System.out.print("Informe o sexo [F/M]: ");
            String sexo = leia.nextLine();

            System.out.print("Informe o peso: ");
            double peso = leia.nextDouble();
            leia.nextLine();

            if(sexo.equalsIgnoreCase("F")){
                quantMulheres++;
                mediaPesoMulheres += peso;
            }
            if(sexo.equalsIgnoreCase("M") && peso > 100){
                quantHomeisComMaisDe100Kg++;
            }
            if(sexo.equalsIgnoreCase("M") && peso > maiorPesoEntreHomens){
               maiorPesoEntreHomens = peso;
            }
        }

        mediaPesoMulheres /= quantMulheres;

        System.out.println("\nResultedos: ");
        System.out.println("Quantidade de mulheres cadastradas: " + quantMulheres);
        System.out.println("Quantidade de homens que pesam mais de 100 Kg: " + quantHomeisComMaisDe100Kg);
        System.out.println("Média de peso das mulheres: " + mediaPesoMulheres);
        System.out.println("Maior peso entre os homens: " + maiorPesoEntreHomens);

        leia.close();
    }
}