package HM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interval {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите свое число");

        int number = Integer.parseInt(reader.readLine());

        System.out.println(check(number));


    }


        public static String check (int a) {

            String res = "";

        if (a >= 0 && a <= 14) {
            res = "промежуток [0 -14]";
        }else if (a >= 15 && a <= 35) {
            res = "промежуток [15 - 35]";
        }else if (a >= 36 && a <= 50) {
            res = "промежуток [36 - 50]";
        }else if (a >= 50 && a <= 100) {
            res = "промежуток [50 - 100]";
        }else {
            res = "число, не входящее ни в один из имеющихся числовых промежутков";
        }
            return res;
        }

    }

