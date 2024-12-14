package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();

        // 确保输入在指定范围内
        if (inputNumber < 0 || inputNumber > 1000000) {
            System.out.println("输入错误，整数的范围应该是[0, 1000000]");
            return; // 终止程序，避免后续不必要的逻辑执行
        }

        int position = 1; // 从个位开始，位置编号为1

        // 从个位开始处理每一位数字
        while (inputNumber > 0) {
            int digit = inputNumber % 10; // 取当前数字的个位
            inputNumber /= 10; // 去掉当前数字的个位

            // 检查数字和位置的奇偶性
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {
                result += 1 * bitValue(position); // 如果奇偶性相同，记录1
            } else {
                result += 0 * bitValue(position); // 如果奇偶性不同，记录0
            }

            position++; // 位置编号加1
        }

        System.out.println(result); // 输出结果
    }

    // 计算二进制位值
    private static int bitValue(int position) {
        return 1 << (position - 1); // 计算2的(position-1)次方
    }
}