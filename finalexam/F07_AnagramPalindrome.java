package finalexam;

import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();

        int[] freq = new int[26];  // 只計算 a~z 的頻次

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 == 1) {
                oddCount++;
            }
        }

        // 至多一個字母出現奇數次才可重排為回文
        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        sc.close();
    }
}

