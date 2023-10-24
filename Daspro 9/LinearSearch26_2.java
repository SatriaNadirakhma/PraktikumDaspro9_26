import java.util.Scanner;
public class LinearSearch26_2 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);
        
        int key;
        int hasil = 0;

        System.out.print("Masukkan Jumlah Element Array : ");
        int[] arrayInt = new int[sc26.nextInt()];

        for (int i = 0; i < arrayInt.length; i++) {

        System.out.print("Masukkan Nilai Elemen Array ke-" + i + " : ");
            arrayInt[i] = sc26.nextInt();
        }

        System.out.print("Masukkan Key yang Anda Cari : ");
        key = sc26.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil == key) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}