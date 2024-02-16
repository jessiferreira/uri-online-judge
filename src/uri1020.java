import java.util.Scanner;

/*
* QUESTÃO URI 1023:
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

OBSERVAÇÃO: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

* ENTRADA:
O arquivo de entrada contém um valor inteiro.

* SAÍDA:
Imprima a saída conforme exemplo fornecido.
 */

public class uri1020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade, anos, meses, dias, resto;

        idade = sc.nextInt();

        anos = idade / 365;
        resto = idade % 365;

        meses = resto / 30;
        dias = resto % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}