package handson1;

public class ForLoop {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        for (int i = 0; i < buah.length; i++) {
            if (i == 3){
                break;
            }
            System.out.println("Elemen ke " + (i + 1) + "adalah : " + buah[i]);
        }
    }
}
