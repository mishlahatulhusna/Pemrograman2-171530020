import java.io.*;

public class PostTest_1{

    public static void main(String[] args) throws IOException{
        BufferedReader dataInput = new BufferedReader( new InputStreamReader(System.In));


        int menu;
        String kodebarang[] = new String[50];
        String namabarang[] = new String[50];
        float harga[] = new float[50];
        int jumlah[] = new int[50];
        String pilih = "";
        boolean status1 = false;
        boolean status2 = false;
        int x = 0;

        do{
            System.out.println(".: Menu App : ");
            System.out.println("[1] Input data barang");
            System.out.println("[2] cetak data barang");
            
            System.out.print("Pilih Menu :");
            menu = Integer.ParseInt(dataInput.readLine());

            if(menu == 1){
                do{
                    System.out.print("Masukan kode barang : ");
                        kodebarang[x] = dataInput.readLine();
                    System.out.print("Masukan nama barang : ");
                        namabarang[x] = dataInput.readLline();
                    System.out.print("Masukan harga : ");
                        harga[x] = Float.parseFloat.dataInput.readLine();
                    System.out.print("Masukan jumlah : ");
                        jumlah[x] = Integer.ParseInt.dataInput.readLine();

                        System.out.print("Apakah anda akan melakukan Input lagi? Y/N");
                            pilih = dataInput.readLine();
                        if(pilih.equals("Y")){
                            status1 = true;
                            x++;
                        }else{
                            status1 = false;
                            status2 = true;
                        }
                }while(status1);
            }else if(menu == 2){
                for (int i=0; i<kodebarang.length; i++){

                        if(!kodebarang[i].equal("")){
                            System.out.println("kode barang : " + kodebarang[i]);
                            System.out.println("nama barang : " + namabarang[i]);
                            System.out.println("harga : " + hargap[i]);
                            System.out.println("jumlah : " + jumlah[i]);
                            System.out.println("\n");
                        }else{
                            break;
                        }
                }
            }
        
    }while(status2);
}