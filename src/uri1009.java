import java.util.Locale;
import java.util.Scanner;

/*
 * QUESTÃO URI 1009:
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
 (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a
 receber no final do mês, com duas casas decimais.

 * ENTRADA:
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas
decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor,
respectivamente.

 * SAÍDA:
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

public class uri1009 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo, totalVenda, comissaoFinal;

        nomeVendedor = sc.nextLine();
        salarioFixo = sc.nextDouble();
        totalVenda = sc.nextDouble();

        comissaoFinal = salarioFixo + totalVenda * 15 / 100;

        System.out.printf("TOTAL = R$ %.2f\n", comissaoFinal);

        sc.close();

    }
}