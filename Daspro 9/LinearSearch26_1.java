import java.util.Scanner;
public class LinearSearch26_1 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);
        int[] arrayInt = new int[10];
        int key;
        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlArray = sc26.nextInt();

        for (int i = 0; i < jmlArray; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc26.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc26.nextInt();

        for (int i = 0; i < jmlArray; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-"+hasil);
                break;
            }
        }
    }
}
