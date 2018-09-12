public class MenghitungTotal {

    public static void main(String[] args) {
        int barang1 = 20000;
        int barang2 = 15000;
        int barang3 = 10000;
        int barang4 = 5000;
        int barang5 = 2000;
        float totalharga = barang1 + barang2 + barang3 + barang4 + barang5;
        System.out.println("barang1 = " + barang1);
        System.out.println("barang2 = " + barang2);
        System.out.println("barang3 = " + barang3);
        System.out.println("barang4 = " + barang4);
        System.out.println("barang5 = " + barang5);
        System.out.println("totalharga = " + totalharga);

        double uang = 100000;
        int kembali = (int) uang- (int) totalharga;
        System.out.println("\tuang = " + uang);
        System.out.println("\tkembalian = " + kembali);
    }
}