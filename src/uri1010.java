import java.util.Locale;
import java.util.Scanner;

/*
* QUESTÃO URI 1010:
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código deuma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

* ENTRADA:
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros
e um valor com 2 casas decimais.

* SAÍDA:
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os
dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
 */

public class uri1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double valor1, valor2, valorPagar;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valorPagar = ((num1 * valor1)) + ((num2 * valor2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);

        sc.close();

    }
}