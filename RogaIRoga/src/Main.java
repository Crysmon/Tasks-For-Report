import java.util.*;

import static java.util.stream.LongStream.range;
import static java.util.stream.IntStream.range;

public class Main
{
    public static void main(String[] args) {
        Scanner NumberChecks = new Scanner(System.in);
        System.out.print("Количество счетов и менеджеров: ");
        int n = NumberChecks.nextInt();
        int m = NumberChecks.nextInt();
        System.out.print("Средства на счетах:\n");

        int[] Cn = new int[n];
        int Sum = 0;
        for (int j = 0; j < n; j++)
        {
            Cn[j] = NumberChecks.nextInt();
            Sum += Cn[j];
        }

        int minPay = 0;
        int maxPay = Sum / m;
        int midPay = 0;

        if (maxPay == 1 || maxPay == 0) System.out.print(maxPay);
        else {
            //используем бинарный поиск для нахождения нужной суммы (O(log(n));
            // проверяем каждую сумму отдельно (O(n));
            // таким образом, сложность алгоритма - O(log(n) * n)
            while (minPay < maxPay) {
                midPay = (minPay + maxPay) / 2;

                int workersPaid = 0;
                for (int check : Cn) {
                    workersPaid = workersPaid + check / midPay;
                }
                    if (workersPaid < m) maxPay = midPay - 1;
                    else minPay = midPay + 1;

            }
                //из-за специфики данной задачи бинарный поиск может промахнуться на 1 вверх
                //сделаем проверку
                int workersPaid = 0;
                for (int check : Cn) {
                    workersPaid = workersPaid + check / minPay;
                }
                    if (workersPaid < m) minPay = minPay - 1;
                    System.out.println(minPay);
        }
    }
}