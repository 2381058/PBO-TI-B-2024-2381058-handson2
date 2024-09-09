package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan pertama: ");
        double num1 - input.nextDouble();

        System.out.println("Masukkan bilangan kedua: ");
        double num2 - input.nextDouble();

        System.out.println("Masukkan bilangan ketiga: ");
        double num3 - input.nextDouble();

        double terbesar;

        if (num1 >= num2 && num1 >= num3) {
            terbesar = num1;
        }else if (num2 >= num1 && num2 >= num3) {
            terbesar = num2;
        }else {
            terbesar = num3;
        }
        System.out.println("Bilangan terbesar adalah: " + terbesar);

        input.close();
    }
}
