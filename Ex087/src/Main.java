/*
87) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+ ----=======---- +
Aprendendo Portugol
+ ----=======---- +
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe uma frase: ");
        String mensagem = leia.nextLine();
        gerador(mensagem);

        leia.close();
    }
    public static void gerador(String mensagem) {
        StringBuffer linha = new StringBuffer("+ ");

        for(int i = 0; i < mensagem.length(); i++){
            linha.append("=");
        }
        linha.append(" +");

        System.out.println(linha);
        System.out.println("  " + mensagem);
        System.out.println(linha);
    }
}