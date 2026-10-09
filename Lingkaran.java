public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = 3.14159;

    // Constructor
    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    // Getter radius
    public double getRadius() {
        return radius;
    }

    // Setter radius
    public void setRadius(double r) {
        this.radius = r;
    }

    // Method menghitung luas
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    // Override method printInfo
    public void printInfo() {
        System.out.println("Lingkaran [" + warna + "], luas = " + hitungLuas());
    }
}