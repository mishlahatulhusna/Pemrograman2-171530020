import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args ) throws IOException {
        BufferedReader dataIn = new BufferedReader( new InputStreamReader(System.in));
         String Kode_brg="", Nama_brg="", Jml_brg="";
         
        System.out.println(" Masukan Kode barang : ");
            Kode_brg = dataIn.readLine();
        System.out.println(" Masukan nama barang : ");
            Nama_brg = dataIn.readLine();
        System.out.println(" Masukan jumlah barang : ");
            Jml_brg = dataIn.readLine();

        System.out.println("");
        System.out.println("-_-_-_-_-");
        System.out.println("kode barang : " + Kode_brg );
        System.out.println("nama barang : " + Nama_brg);
        System.out.println("jumlah barang :" + Jml_brg);
    }
} 