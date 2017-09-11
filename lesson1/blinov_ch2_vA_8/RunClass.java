package lesson1.blinov_ch2_vA_8;

import java.io.IOException;

//Ввести N чисел с консоли. Среди чисел найти число-палиндром. Если таких чисел больше одного,  найти второе.

public class RunClass {
    public static void main(String[] args) throws IOException {
        FindPalindrome find = new FindPalindrome();
        find.findPalindrome();
        PalindromeQuantity quantity = new PalindromeQuantity();
        quantity.howMuchPalindromes();
    }
}
