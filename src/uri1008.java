import java.util.Locale;
import java.util.Scanner;

/*
 * QUESTÃO URI 1008:
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

 * ENTRADA:
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número,
quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

 * SAÍDA:
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da
igualdade. No caso do salário, também deve haver um espaço em branco após o $.
 */

public class uri1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario, hora;
        double valorHora, salario;

        funcionario = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = hora * valorHora;

        System.out.println("NUMBER = " + funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();

    }
}