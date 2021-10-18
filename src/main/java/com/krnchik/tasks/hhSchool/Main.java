package com.krnchik.tasks.hhSchool;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        if (!data.matches("[0-9]+ [0-9]+")) {
            throw new IllegalArgumentException();
        }
        String[] input = data.split(" ");
        int accountN = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] accounts = new int[accountN];
        int sum = 0;
        for (int i = 0; i < accountN; i++) {
            String account = in.nextLine();
            accounts[i] = Integer.parseInt(account);
            sum += accounts[i];
        }

        int bonus = sum / M;
        int min = 1;
        int max = bonus;
        int mid;

        if (bonus == 0) {
            System.out.println(bonus);
        } else {
            while (min <= max) {
                mid = (max + min) / 2;
                if (isMaxBonus(accounts, mid, M)) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
            System.out.println(max);
        }
    }

    private static boolean isMaxBonus(int[] accounts, int bonus, int M) {
        int count = 0;
        for (int account : accounts) {
            count += (account / bonus);
        }
        return count < M;
    }
}