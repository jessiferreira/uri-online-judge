import java.util.Scanner;

/*
* QUESTÃO URI 1018:
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação
de notas necessárias.

* ENTRADA:
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

* SAÍDA:
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo
fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa
apresentará a mensagem: “Presentation Error”.
 */

public class uri1018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notas = sc.nextInt();

        int notaInserida = notas;

        int nota100 = notaInserida / 100;
        notaInserida -= nota100 * 100;

        int nota50 = notaInserida / 50;
        notaInserida -= nota50 * 50;

        int nota20 = notaInserida / 20;
        notaInserida -= nota20 * 20;

        int nota10 = notaInserida / 10;
        notaInserida -= nota10 * 10;

        int nota5 = notaInserida / 5;
        notaInserida -= nota5 * 5;

        int nota2 = notaInserida / 2;
        notaInserida -= nota2 * 2;

        int nota1 = notaInserida;

        System.out.println(notas);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        sc.close();

    }
}