import java.util.Scanner;

/*
 * QUESTÃO URI 1003:
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA.
A seguir escrever o valor desta variável.

 * ENTRADA:
O arquivo de entrada contém 2 valores inteiros.

 * SAÍDA:
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade
seguido pelo valor correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir o fim de linha
após o resultado, caso contrário, você receberá "Presentation Error".
 */

public class uri1003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
