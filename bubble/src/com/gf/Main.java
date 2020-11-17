package com.gf;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("length?:");
        Scanner input = new Scanner(System.in);
        String length = input.nextLine();

        if (Integer.parseInt(length) > 0) {

            int[] ints = new int[Integer.parseInt(length)];
            // csak pozitív, egész számok; 0-val megáll
            System.out.println("+ints or 0 to stop:");

            for (int j = 0; j < Integer.parseInt(length); j++) {
                input = new Scanner(System.in);
                String incoming = input.nextLine();
                ints[j] = Integer.parseInt(incoming);
                if (0 >= Integer.parseInt(incoming)) {
                    break;
                }
            }

            bubble(ints);
            System.out.println(Arrays.toString(bubble(ints)));

            System.out.println("reversre?true=1");
            input = new Scanner(System.in);
            String reverse = input.nextLine();

            if (Integer.parseInt(reverse) == 1) {
//                print(reverse(ints));
                System.out.println(Arrays.toString(reverse(ints)));
            } else System.out.println("not");
        }
    }


    static int[] bubble(int[] ints) {
        for (int j = 0; j < ints.length; j++) {
            for (int k = 0; k < ints.length - j - 1; k++) {
                if (ints[k] > ints[k + 1]) {
                    int tmp = ints[k];
                    ints[k] = ints[k + 1];
                    ints[k + 1] = tmp;
                }
            }
        }
        return ints;
    }

    static int[] reverse(int[] ints) {
        int[] ints2 = new int[ints.length];
        for (int l = 0; l < ints.length; l++) {
            ints2[l] = ints[ints.length - l - 1];
        }
        return ints2;
    }

//    static void print(int[] ints) {
//        for (int j = 0; j < ints.length; j++) {
//            System.out.println(ints[j]);
//        }
//    }
}
