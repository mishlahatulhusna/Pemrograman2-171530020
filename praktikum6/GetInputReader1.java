import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader1 {
    public static void main(String[] args) throws IOException {
             BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String nim="", nama="" ,tempat="", tgllahir="";
        System.out.print("Masukan nama anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukan NIM anda : ");
            nim = dataIn.readLine();
        System.out.print("Masukan tempat lahir anda : ");
            tempat = dataIn.readLine();
        System.out.print("Masukan tanggal lahir anda : ");
            tgllahir =  dataIn.readLine();

        System.out.println("");
        System.out.println("----------------------------------- ");
        System.out.println("----------------------------------- ");
        System.out.println("Selamat Datang " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Tempat lahir : " + tempat);
        System.out.println("Tanggal lahir : " + tgllahir);
    } 


}