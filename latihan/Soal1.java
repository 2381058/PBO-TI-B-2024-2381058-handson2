package latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Masukkan angka pertama");
            int a = input.nextInt();

            System.out.println("Masukkan angka kedua");
            int b = input.nextInt();

            if(a > b){
                System.out.println("Angka pertama ialah angka maksimum");
                System.exit(0);
            }

            if (a < b){
                System.out.println("Angka kedua ialah angka maksimum");
                System.exit(0);
            }
    }
}
