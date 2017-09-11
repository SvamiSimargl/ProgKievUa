package lesson1.blinov_ch2_vA_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindPalindrome {
    private static ArrayList<Integer> list = new ArrayList<>();


    void findPalindrome() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much numbers to input for finding palindrome numbers?");
        int nums = Integer.parseInt(reader.readLine());
        System.out.println("Please, input your numbers.");

        for (int i = 0; i < nums; i++) {
            int numbers = Integer.parseInt(reader.readLine());
            if (getPalindromeNumbers(numbers)) {
                list.add(numbers);
            }
        }
    }

    private boolean getPalindromeNumbers(int numbers) {
        if (numbers / mirrorNum(numbers) == 1) {
            return true;
        } else {
            return false;
        }
    }

    private int mirrorNum(int num) {
        int mirror = 0;
        while (num != 0) {
            mirror = mirror * 10 + (num % 10);
            num = num / 10;
        }
        return mirror;
    }

    void palindromesList() {
        for (Integer q : list) {
            System.out.println(q);
        }
    }
}
