/*
89) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3

Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol Studio
Portugol Studio
Portugol Studio
~~~~~~~~:::::::~~~~~~~
*/

public class Main {
    public static void main(String[] args) {
        gerador("   Aprendendo Java", 3, 3);
    }
    public static void gerador(String frase, int repeticoes, int tipoBorda) {
        String borda;
        if (tipoBorda == 1){
            borda = "+-------=======------+";
        }
        else if(tipoBorda == 2){
            borda = "~~~~~~~~:::::::~~~~~~~";
        }
        else{
            borda = "<<<<<<<<------->>>>>>>";
        }

        System.out.println(borda);
        for(int i = 0; i < repeticoes; i++){
            System.out.println(frase);
        }
        System.out.println(borda);
    }
}