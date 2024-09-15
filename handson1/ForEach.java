package handson1;

import java.sql.SQLOutput;

public class ForEach {
    public static void main(String[] args) {
        String[] kumpulanBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        for (String buah : kumpulanBuah){
            System.out.println(buah);
        }
    }
}
