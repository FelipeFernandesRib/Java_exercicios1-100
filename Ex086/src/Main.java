/*
86) Crie um programa que tenha um procedimento Gerador() que, quando chamado,
mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
Ex: Ao chamar Gerador() aparece:
+ ======= +
Olá, Mundo!
+ ======= +
*/

public class Main {
    public static void main(String[] args) {
        gerador();

    }
    public static void gerador(){
        StringBuffer linha = new StringBuffer("+ ");
        String mensagem = "Olá, Mundo!";

        for(int i = 0; i < mensagem.length(); i++){
            linha.append("=");
        }
        linha.append(" +");

        System.out.println(linha);
        System.out.println("  " + mensagem);
        System.out.println(linha);
    }
}