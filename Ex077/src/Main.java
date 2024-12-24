/*
77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String [] num = new String[7];
        Scanner leia = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.print("Informe um nome: ");
            String nome = leia.nextLine();
            num[i] = nome;

        }

        for(int i = 6; i >= 0; i--){
            System.out.print(num[i] + " ");
        }

        leia.close();
    }
}