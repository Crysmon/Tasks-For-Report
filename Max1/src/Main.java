import java.util.ArrayList;
import java.awt.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Main
{
    public static Double MaxiMOM(ArrayList<Double> list)
    {
        double max = list.get(0);
        for (double i: list) {
            if(i > max)
                max = i;
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int k = in.nextInt();
        if (k<=0) {
            System.out.print("Невозможно найти значения");
            return;
        }
        Double nums[] = new Double[k];
        for(int i=0; i<k; i++){
            Double m = in.nextDouble();
            nums[i] = m;
        }
        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(nums));
        System.out.println("Максимальное число: " + MaxiMOM(list));
    }
}