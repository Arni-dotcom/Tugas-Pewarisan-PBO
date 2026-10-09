public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    // Getter tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter tinggi
    public void setTinggi(double t) {
        this.tinggi = t;
    }

    // Method menghitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    // Override method printInfo
    public void printInfo() {
        System.out.println("Silinder warna [" + warna + "], volume = " + hitungVolume());
    }
}