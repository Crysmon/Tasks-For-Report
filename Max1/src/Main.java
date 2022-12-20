import java.util.ArrayList;
import java.awt.*;
import java.math.*;
import java.text.*;

public class Main
{
    public static double MaxiMOM(ArrayList<Double> list)
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
        System.out.println("Список:\n");
        ArrayList<Double> list = new ArrayList<Double>();
        int k = 10;
        for(int i=0; i<=k; i++){
            double max =10000, min = -10000;
            double m = (Math.random() * ((max - min) + 1)) + min;
            list.add(m);
        }
        System.out.println(list);
        System.out.println("\nМаксимальное число: " + MaxiMOM(list));
    }
}