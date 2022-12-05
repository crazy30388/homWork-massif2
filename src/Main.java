

import java.util.Arrays;
import java.util.Random;

public class Main {
        public static void main(String[] args) {
        int[] array = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(100_000) + 100_000;
            }

        //сумма трат за месяц
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + average + " рублей");

        // минимальная и максимальная трата
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
             min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей." + " " +
                "Максимальня сумма трат за месяц составила " + max + " рублей");


        //средняя сумма трат
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] / array.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");

        //задача 4
            String string = "чивонавИ навИ вонавИ";
            System.out.println(string);
            char[] stringToChar = string.toCharArray();
            System.out.println(Arrays.toString(stringToChar));
            for (int i = stringToChar.length - 1; i >= 0; i--) {
                System.out.print(stringToChar[i]);
                
            }


    }

}
