/*
74) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9
*/

public class Main {
    public static void main(String[] args) {
        int [] num = new int[10];

        for(int i = 0; i < 9; i++){
            num[i] = 5;
            num[i + 1] = 3;
            i++;
        }

        for(int exibir: num){
            System.out.print(exibir + " ");
        }
    }
}