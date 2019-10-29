package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int num = input.length();
        int count = 0;
        for (int center = 0; center <= 2 * num - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < num && input.charAt(left) == input.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
