package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * @author:Rohit
 */

public class SumNaturalUsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Nth Natural Number: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            integers.add(i);
        }
        Integer ans = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(ans);
    }

}
