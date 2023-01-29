import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, sistemOperasi, result = 0;

        System.out.println("== Selamat Datang di Program Kalkulator Sederhana ==");
        System.out.println(" Sistem Operasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Hasil Bagi/Modulus");
        System.out.println("======================================");

        //pilih menu
        System.out.println("Pilih Sistem Operasi : ");
        sistemOperasi = input.nextInt();

        switch (sistemOperasi) {
            case 1 : result = angka1 + angka2; break;
            case 2 : result = angka1 - angka2; break;
            case 3 : result = angka1 * angka2; break;
            case 4 : result = angka1 / angka2; break;
            case 5 : result = angka1 % angka2; break;
            default:
                System.out.println("Harap Memasukan Sistem Operasi dengan Benar!");
        }

        //input data
        System.out.println("Masukan Angka Pertama : ");
        angka1 = input.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        angka2 = input.nextInt();

        System.out.println("Hasilnya Adalah : " + result);
    }
}
