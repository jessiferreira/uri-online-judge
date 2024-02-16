import java.util.Scanner;

/*
* QUESTÃO URI 1013:
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
Utilize a fórmula: MaiorAB = (a + b + abs(a - b)) / 2

OBSERVAÇÃO: A fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
para chegar no resultado esperado.

* ENTRADA:
O arquivo de entrada contém três valores inteiros.

* SAÍDA:
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

EXEMPLO:
Entrada: 7 14 106
Saída: 106 eh o maior
 */

public class uri1013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2; // Calcula o maior valor entre A e B.
        maiorAB = (maiorAB + c + Math.abs(maiorAB - c)) / 2; // Calcula o maior valor entre o resultado anterior e C.

        System.out.println(maiorAB + " eh o maior");

        sc.close();

    }
}