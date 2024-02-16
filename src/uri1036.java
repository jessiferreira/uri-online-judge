import java.util.Locale;
import java.util.Scanner;

/*
* QUESTÃO URI 1036:
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular
as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
número negativo.

* ENTRADA:
Leia três valores de ponto flutuante (double) A, B e C.

* SAÍDA:
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossível calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente
conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
 */

public class uri1036 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - 4.0 * a * c;

        // a igual a zero e delta menor que zero
        if (a == 0 || delta < 0.0) {
            System.out.println("Impossível calcular!");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
        sc.close();
    }
}
