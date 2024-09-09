package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi yang diinginkan:");
        System.out.println("1.Penjumlahan(+)");
        System.out.println("2.Pengurangan(-)");
        System.out.println("3.Perkalian(*)");
        System.out.println("4.Pembagian(/)");

        System.out.println("Masukkan pilihan operasi (1-4):");
        int pilihan = input.nextInt();

        System.out.println("Masukkan bilangan pertama:");
        int bil1 = input.nextInt();

        System.out.println("Masukkan bilangan kedua:");
        int bil2 = input.nextInt();

        int hasil = 0;

        switch (pilihan){
            case 1:
                hasil = bil1 + bil2;
                System.out.println("Hasil penjumlahan:" + hasil);
                break;
            case 2:
                hasil = bil1 - bil2;
                System.out.println("Hasil pengurangan:" + hasil);
                break;
            case 3:
                hasil = bil1 * bil2;
                System.out.println("Hasil perkalian:" + hasil);
                break;
            case 4:
                if (bil2 != 0){
                    hasil = bil1 / bil2;
                    System.out.println("Hasil pembagian:" + hasil);

                }else{
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada.");
        }
        input.close();
    }
}
