import java.util.Scanner;

/*
 * QUESTÃO URI 1004:
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação
à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.

 * ENTRADA:
O arquivo de entrada contém 2 valores inteiros.

 * SAÍDA:
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois
da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará
a mensagem: “Presentation Error”.
 */

public class uri1004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}