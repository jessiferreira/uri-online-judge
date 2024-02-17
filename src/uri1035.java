import java.util.Scanner;

public class uri1035 {

/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável
A for par escrever a mensagem "Valores aceitos", senão escrever "Valores não aceitos".

ENTRADA: Quatro números inteiros A, B, C e D.

SAÍDA: Mostre a respectiva mensagem após a validação dos valores.
 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Verificando se B é maior que C
        // Verificando se D é maior que A
        // Verificando se a soma de C e D é maior que a soma de A e B
        // Verificando se C e D são ambos positivos
        // Verificando se A é par
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos!");
        } else {
            System.out.println("Valores não aceitos!");
        }

        sc.close();

    }
}
