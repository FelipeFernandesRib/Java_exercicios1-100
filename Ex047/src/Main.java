/*47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
        450 + 400 + 350 + 300 + ... + 50 + 0
*/

public class Main {
    public static void main(String[] args) {
        int contador = 500;
        int resultado = 0;

        while (contador >= 0) {
            resultado = resultado + contador;
            contador = contador - 50 ;
        }
        
        System.out.print(resultado);
    }
}