package org.d3ifcool.assessment01;

import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
        float bil1 = input.nextFloat();
        char o = input.next().charAt(0);
        float bil2 = input.nextFloat();

        switch (o) {
            case '+' :
                float penjumlahan = bil1 + bil2;
                System.out.printf("%.3f", penjumlahan);
                break;
            case '-' :
                float pengurangan = bil1 - bil2;
                System.out.printf("%.3f", pengurangan);
                break;
            case '*' :
                float perkalian = bil1 * bil2;
                System.out.printf("%.3f", perkalian);
                break;
            case '/' :
                float pembagian = bil1 / bil2;
                System.out.printf("%.3f", pembagian);
                break;
            case '^' :
                double pemangkatan = Math.pow(bil1, bil2);
                System.out.printf("%.3f", pemangkatan); 
        }
	}
}
