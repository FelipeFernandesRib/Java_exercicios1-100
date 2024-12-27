/*
88) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+ ----=======---- +
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+ ----=======---- +
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe a frase: ");
        String fraseEscolhida = leia.nextLine();
        
        System.out.print("Informe o número de vezes que essa frase será exibida: ");
        int numRepeticoes = leia.nextInt();

        gerador(fraseEscolhida, numRepeticoes);
        leia.close();
    }
    public static void gerador(String frase, int repeticoes) {
        StringBuilder linha = new StringBuilder("x -");
        linha.append("-".repeat(frase.length()));
        linha.append("- x");

        System.out.println(linha);
        for (int i = 0; i < repeticoes; i++){
            System.out.println("   " + frase);
        }
        System.out.println(linha);
    }
}