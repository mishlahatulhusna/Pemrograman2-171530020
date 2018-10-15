public class DemoArray {

    public static void main(String[] args) {
        System.out.println("\nContoh 1\n");
        String nama[] = new String[5];
        nama[0] = "Andi Novianto";
        nama[1] = "Zidna Aisya";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        System.out.println("\n\nContoh 2\n");
        int nilai[] = {75, 80, 90, 100};
        System.out.println("Cetak nilai eleman 0 : "+nilai[0]);
        System.out.println("Cetak nilai eleman 1 : "+nilai[1]);
        System.out.println("Cetak nilai eleman 2 : "+nilai[2]);
        System.out.println("Cetak nilai eleman 3 : "+nilai[3]);
        int jumlah = nilai[1] + nilai[2] + nilai[3];
        System.out.println("jumlah nilai elemen (1+2+3) : "+jumlah);
     
    }
}

//penjelasan :
// 1. memebuat class baru dengan nama DemoArray dengan modifier public 
// 3. membuat method main yg berfgsi sebagai method yang pertama kalli dijalankan
// 5. deklarasi variabel array dengan nama 'nama' dan diberikan panjang array 5
// 6. memberikan nilai pada variabel array dengan elemen 0 dengan nlai 'andi novianto'
// 13. deklarasi variabel array dengan nama nilai dan tipe data dan memiliki panjang array 4 dan langsung diinisialisaiskan
// 18. sintakk untuk menjumlah 