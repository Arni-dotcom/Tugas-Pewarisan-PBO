import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menampung seluruh objek
        ArrayList<Bentuk> daftarBentuk = new ArrayList<>();

        // Menambahkan objek Latihan 1, 2, dan 3
        daftarBentuk.add(new BujurSangkar(5.0, "Merah"));
        daftarBentuk.add(new Lingkaran(7.0, "Biru"));
        daftarBentuk.add(new Silinder(10.0, 7.0, "Hijau"));

        // Menampilkan informasi seluruh bentuk
        System.out.println("=== Hasil ===");
        for (Bentuk b : daftarBentuk) {
            b.printInfo();
        }
    }
}