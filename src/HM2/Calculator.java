package HM2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите первое число");
        int operand1 = Integer.parseInt(reader.readLine());

        System.out.println("введите знак арифметической операции");
        String sign = reader.readLine();

        System.out.println("введите второе число");
        int operand2 = Integer.parseInt(reader.readLine());

        reader.close();

        System.out.println("результат вычисления = " + calc(operand1, operand2, sign ));

    }

    public static String calc (int number1, int number2, String oper) {

        String answer = "";

        switch (oper) {
            case "+":
                answer = number1 + number2 + "";
                break;
            case "-":
                answer = number1 - number2 + "";
                break;
            case "*":
                answer = number1 * number2 + "";
                break;
            case "/":
                if (number2 != 0) {
                    answer = number1 / number2 + "";
                }else {
                    answer = "делить на ноль нельзя";
                }
                break;
        }


        return answer;
    }
}