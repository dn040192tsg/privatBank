package HM3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bingo {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        short n = (short) (Math.random() * 100);
        System.out.println(n);
        System.out.println("я загадал число от 1 до 100, попробуй его отгадать. Чтобы отгадать введи число на консоли. Чтобы завершить игру введи слово stop");
        int count = 0;


        while (true) {
            try {
                String num = reader.readLine();

                if (num.equals("stop")) {
                    break;
                }

                int a = Integer.parseInt(num);
                count++;

                if (a == n) {
                    System.out.println("ты отгадал, это число " + n + " количество потраченных попыток - " + count);
                    break;
                } else if (a < n) {
                    System.out.println("ты не отгадал, загаданное число больше");
                } else {
                    System.out.println("ты не отгадал, загаданное число меньше");
                }

            } catch (Exception e) {
                System.out.println("ты ввел не число, попробуй еще раз");
            }
        }

        System.out.println("игра закончена");

    }
}
