package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int q = a.nextInt();
        int x = root(b,q);
        System.out.println(x);
        }
    public static int root(int a, int b) {
        int z=1;
        for (int i=0; i<b; i++)
            z *= a;
        return z;
        }
    }
