import java.util.Locale;
import java.util.Scanner;

/*
 * QUESTÃO URI 1012:
 Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
 Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

 * ENTRADA:
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

 * SAÍDA:
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
apresentado com 3 dígitos após o ponto decimal.
 */

public class uri1012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = (A * C) / 2;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);

        circulo = 3.14159 * C * C;
        System.out.printf("CIRCULO: %.3f\n", circulo);

        trapezio = (A + B) * C / 2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);

        quadrado = B * B;
        System.out.printf("QUADRADO: %.3f\n", quadrado);

        retangulo = A * B;
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        sc.close();
    }
}