import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, sistemOperasi, result = 0;
        String namaOperasi = "";
        System.out.println("======== Selamat Datang di =======");
        System.out.println("== Program Kalkulator Sederhana ==");

        // input angka
        System.out.print("Masukan Angka Pertama : ");
        angka1 = input.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        angka2 = input.nextInt();

        System.out.println("Silakan Pilih Sistem Operasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus/Sisa Bagi");
        System.out.println("==============================");

        // pilih sistem operasi
        System.out.print("Pilih Sistem Operasi : ");
        sistemOperasi = input.nextInt();

        switch (sistemOperasi) {
            case 1 : result = angka1 + angka2; namaOperasi = " tambah "; break;
            case 2 : result = angka1 - angka2; namaOperasi = " kurang "; break;
            case 3 : result = angka1 * angka2; namaOperasi = " kali "; break;
            case 4 : result = angka1 / angka2; namaOperasi = " bagi "; break;
            case 5 : result = angka1 % angka2; namaOperasi = " modulus "; break;
            default:
                System.out.println("Mohon Memilih Sistem Operasi dengan Benar!");
        }

        System.out.println("Hasil dari " + angka1 + namaOperasi + angka2 + " adalah " + result);

        // membuat file txt
        try {
            File data = new File("/home/rozi/Desktop/result.txt");
            PrintWriter print = new PrintWriter(new FileWriter(data, false));
            print.println("Hasil dari " + angka1 + namaOperasi + angka2 + " adalah " + result);
            print.close();
            System.out.println("Hasil Sudah Tersimpan di File result.txt!");
        } catch (Exception e) {
            System.out.println("File Tidak Dapat Dicetak");
        }
    }
}
