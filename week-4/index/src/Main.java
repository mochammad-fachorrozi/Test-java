import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Gehu");
        foods.add("Tahu");
        foods.add("Bala-bala");
        foods.add("Tempe");
        foods.add("Cireng");
        foods.add("Cilok");
        foods.add("Cimol");
        foods.add("Basreng");
        foods.add("Seblak");
        foods.add("Kwetiaw");
        foods.add("Mia Ayam");
        System.out.println("====== List Nama Makanan Indonesia =======");
        System.out.println(foods);


        ArrayList<Integer> tahun = new ArrayList<Integer>();
        tahun.add(2010);
        tahun.add(2014);
        tahun.add(2018);
        tahun.add(2012);
        System.out.println("====== List Tahun Piala Dunia Terakhir =======");
        System.out.println(tahun);


        ArrayList<String> prov = new ArrayList<String>();
        prov.add("Papua");
        prov.add("Bali");
        prov.add("NTT");
        prov.add("NTB");
        prov.add("Jawa Timur");
        prov.add("Jawa Tengah");
        prov.add("Jawa Barat");
        prov.add("Riau");
        prov.add("Lampung");
        prov.add("DKI Jakarta");
        prov.add("DIY");
        Collections.sort(prov, Collections.reverseOrder());

        System.out.println("====== List Provinsi di Indonesia =======");
        System.out.println(prov);

        ArrayList<String> bahasa = new ArrayList<String>(12);
        bahasa.add("C");
        bahasa.add("C#");
        bahasa.add("C++");
        bahasa.add("PHP");
        bahasa.add("Ruby");
        bahasa.add("Java");
        bahasa.add("Javascript");
        bahasa.add("Phyton");
        bahasa.add("VB");
        bahasa.add("Rust");
        bahasa.add("Go");
        bahasa.add("Kotlin");

        bahasa.remove("C");
        bahasa.remove("Java");
        bahasa.remove("C++");
        bahasa.remove("VB");
        bahasa.remove("Rust");
        System.out.println("====== List Beberapa Bahasa Pemrograman =======");
        System.out.println(bahasa);
    }
}