import java.util.Scanner;

/*
* QUESTÃO URI 1019:
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

* ENTRADA:
O arquivo de entrada contém um valor inteiro N.

* SAIDA:
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme
exemplo fornecido.
_________________________________________________________________________________________________________
* ANÁLISE:
1 minuto = 60 segundos
1 hora = 60 minutos = 3600 segundos

- 140153 segundos contém quantas horas?
140153 / 3600 = 38,931388...

38 * 3600 = 136800
SOBRA: 3353

3353 / 60 = 55,8833...

55 * 60 = 3300
SOBRA: 53
 */

public class uri1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N, resto, horas, minutos, segundos;

        N = sc.nextInt();

        horas = N / 3600;
        resto = N % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}