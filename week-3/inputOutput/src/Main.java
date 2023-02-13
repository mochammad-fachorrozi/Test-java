import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Masukan Nama : ");
        name = input.nextLine();

        System.out.println("Selamat Datang di Bootcamp Kawah Edukasi, " + name);

        short myNumber = 1000, myAngka = 5000;
        double myMoney = 19.99d, myUang = 29.99d;
        char myInitial = 'F', myInisial = 'R';
        boolean myBool = true, isTrue = false;
        // System.out.println(isTrue);

        String firstText = "Saya senang", middleText = " belajar", lastText = " Java Language";
        System.out.println(firstText + middleText + lastText);
    }
}