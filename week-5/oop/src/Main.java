public class Main {
    public static void main(String[] args) {
        System.out.println("List Tanah Punya Pak Dengklek : ");

        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        System.out.println("Keliling Persegi : " + persegi.hitungKeliling());
        System.out.println("Luas Persegi : " + persegi.hitungLuas());

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 10;
        persegiPanjang.lebar = 5;
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 10;
        segitiga.tinggi = 7;
        segitiga.sisiA = 8;
        segitiga.sisiB = 9;
        System.out.println("Keliling Segitiga : " + segitiga.hitungKeliling());
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;
        System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
        System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());
    }
}