package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑

        int digit = 1;
        int binaryValue = 0;
        int multiplier = 1;
        while (inputNumber > 0) {
            int digitValue = inputNumber % 10;
            if ((digitValue % 2 == 0 && digit % 2 == 0) || (digitValue % 2 == 1 && digit % 2 == 1)) {
                binaryValue += multiplier;

            }
            inputNumber /= 10;
            digit++;
            multiplier *= 2;
        }

        result = binaryValue;
        System.out.println(result);
    }
}
