import java.util.Scanner;

/*
 * QUESTÃO URI 1007:
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de
C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

 * ENTRADA:
O arquivo de entrada contém 4 valores inteiros.

 * SAÍDA:
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco
antes e depois da igualdade.
 */

public class uri1007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIF;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIF = (A * B - C * D);

        System.out.println("DIFERENÇA = " + DIF);

        sc.close();

    }
}