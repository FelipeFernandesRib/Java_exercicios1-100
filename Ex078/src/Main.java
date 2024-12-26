/*
78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int [] num = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.print("Informe um número: ");
            int numEscolhido = leia.nextInt();

            num[i] = numEscolhido;
        }

        System.out.println("\nNúmeros do vetor");
        for(int exibir : num){
            System.out.print(exibir + " ");
        }

        System.out.println("\nPosições no vetor dos números divisíveis por 10: ");
        for(int i = 0; i < 15; i++){
            if(num[i] % 10 == 0){
                System.out.print("\nPosição " + i);
            }
        }
        
        leia.close();
    }
}