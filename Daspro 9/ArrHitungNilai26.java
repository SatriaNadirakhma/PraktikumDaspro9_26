import java.util.Scanner;
public class ArrHitungNilai26 {
    public static void main(String[] args) {
        Scanner sc26 = new Scanner (System.in);

        int[] nilai = new int[10];
        double nilaiRata2;
        int jmlNilai = 0;
        int nilaiTinggi, nilaiRendah;
        double total = 0;
        
        System.out.print("Masukkan Banyaknya Nilai : ");
        jmlNilai = sc26.nextInt();

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i] = sc26.nextInt();
            total += nilai[i];
        }

        nilaiTinggi = nilai[0];
        nilaiRendah = nilai[0];
        for (int i = 0; i < jmlNilai; i++){
            if(nilai[i] > nilaiTinggi){
            nilaiTinggi = nilai[i];
            } else if (nilai[i] < nilaiRendah) {
            nilaiRendah = nilai[i];
            }
        }

        nilaiRata2 = total / jmlNilai;
        System.out.println("Rata-rata nilai adalah : " + nilaiRata2);
        System.out.println("Nilai tertinggi adalah : " + nilaiTinggi);
        System.out.println("Nilai terendah adalah : " + nilaiRendah);
    }
}
