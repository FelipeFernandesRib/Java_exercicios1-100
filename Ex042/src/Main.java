/*
42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe um número inteiro e positivo: ");
        if(leia.hasNextInt()){      //verifica se foi informado um número inteiro positivo
            int num = leia.nextInt(), contador = 0;
            while( contador <= num) {
                System.out.print(contador + "  ");
                contador++;
            }
        }
        else{
            System.out.println("Não foi informado um número inteiro positivo");
            return;
        }
        System.out.print("Acabou!");
        leia.close();
    }
}