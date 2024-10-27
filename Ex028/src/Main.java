/*
28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a largura do terreno: ");
        double largura = leia.nextDouble();

        System.out.print("Informe o comprimento do terreno: ");
        double comprimento = leia.nextDouble();

        double area = largura * comprimento;

        System.out.print("O terreno tem uma aréa de: " + area + "m²\n");

        if(area < 100){
            System.out.print("TERRENO POPULAR");
        }
        else if(area >= 100 && area <= 500 ){
            System.out.print("TERRENO MASTER");
        }
        else if (area > 500){
            System.out.print("TERRENO VIP");
        }

        leia.close();
    }
}