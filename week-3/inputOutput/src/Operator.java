import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double luasLingkaran, luasBalok, phi = 3.14, r, p, l, t;

        System.out.println("=== Program Luas Lingkaran ===");
        System.out.print("Masukan nilai jari-jari : ");
        r = input.nextDouble();
        luasLingkaran = phi*r*r;
        System.out.println("Luas Lingkaran = " + luasLingkaran);

        System.out.println("");
        System.out.println("=== Program Luas Balok ===");
        System.out.print("Masukan nilai panjang : ");
        p = input.nextDouble();
        System.out.print("Masukan nilai lebar : ");
        l = input.nextDouble();
        System.out.print("Masukan nilai tinggi : ");
        t = input.nextDouble();
        luasBalok = p*l*t;
        System.out.println("Luas Balok = " + luasBalok);
    }
}
