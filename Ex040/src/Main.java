/*
40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
*/

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 18){
            System.out.print(contador + " ");
            contador =contador + 3;
        }
        System.out.print("Acabou");
    }
}