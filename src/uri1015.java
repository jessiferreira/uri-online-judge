import java.util.Locale;
import java.util.Scanner;

/*
 * QUESTÃO URI 1015:
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula.

 * ENTRADA:
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante:
x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

 * SAÍDA:
 Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */

public class uri1015 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distancia;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        System.out.printf("%.4f\n", distancia);

        sc.close();


    }
}