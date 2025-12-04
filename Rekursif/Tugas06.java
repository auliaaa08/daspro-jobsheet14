import java.util.Scanner;
public class Tugas06 {

    // Fungsi rekursif untuk menjumlahkan array angka
    public static int fungsiRekursif(int[] angka, int index) {
        if (index == angka.length) {
            return 0;
        }
        return angka[index] + fungsiRekursif(angka, index + 1);
    }

    // Fungsi iteratif untuk menjumlahkan array angka
    public static int fungsiIteratif(int[] angka) {
        int total = 0;
        for (int a : angka) {
            total += a;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Fungsi Rekursif dan Iteratif ===\n");

        // Input jumlah angka
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = input.nextInt();
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Hitung total menggunakan rekursif
        int hasilRekursif = fungsiRekursif(angka, 0);
        System.out.println("\nTotal (Rekursif)   : " + hasilRekursif);

        // Hitung total menggunakan iteratif
        int hasilIteratif = fungsiIteratif(angka);
        System.out.println("Total (Iteratif)   : " + hasilIteratif);

    }
}