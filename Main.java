public class Main {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("hitam");
        b.printInfo();

        BujurSangkar bs = new BujurSangkar(4, "kuning");
        bs.printInfo();

        Lingkaran l = new Lingkaran(9, "putih");
        l.printInfo();

        Silinder s = new Silinder(12, 6, "coklat");
        s.printInfo();
    }
}
