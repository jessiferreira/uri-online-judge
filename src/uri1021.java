import java.util.Locale;
import java.util.Scanner;

/*
* QUESTÃO URI 1021:
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

* ENTRADA:
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

* SAÍDA:
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

- OBSERVAÇÃO: Utilize ponto (.) para separar a parte decimal.
 */

public class uri1021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        // Converte o valor para parte inteira e parte decimal.
        int valorInteiro = (int) valor;
        // Calcula a quantidade mínima de notas necessárias (parte inteira do valor)
        int notas = valorInteiro;
        // Calculando a quantidade mínima de moedas necessárias (parte decimal do valor convertida para centavos)
        int moedas = (int) ((valor - valorInteiro) * 100);

        System.out.println("NOTAS:");
        System.out.println(notas / 100 + " nota(s) de R$ 100.00");
        notas %= 100;
        System.out.println(notas / 50 + " nota(s) de R$ 50.00");
        notas %= 50;
        System.out.println(notas / 20 + " nota(s) de R$ 20.00");
        notas %= 20;
        System.out.println(notas / 10 + " nota(s) de R$ 10.00");
        notas %= 10;
        System.out.println(notas / 5 + " nota(s) de R$ 5.00");
        notas %= 5;
        System.out.println(notas / 2 + " nota(s) de R$ 2.00");
        notas %= 2;

        System.out.println("MOEDAS:");
        System.out.println(notas + " moeda(s) de R$ 1.00");
        System.out.println(moedas / 50 + " moeda(s) de R$ 0.50");
        moedas %= 50;
        System.out.println(moedas / 25 + " moeda(s) de R$ 0.25");
        moedas %= 25;
        System.out.println(moedas / 10 + " moeda(s) de R$ 0.10");
        moedas %= 10;
        System.out.println(moedas / 5 + " moeda(s) de R$ 0.05");
        moedas %= 5;
        System.out.println(moedas + " moeda(s) de R$ 0.01");

        sc.close();
    }

}