// input library io untuk fungsi input data 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//bisa dirinkas dengan import java.io.*

public class InputNilai {

    public static void main(String[] args) {

        //deklarasi variabel
        String nim;
        String nama;
        String mata_kuliah;
        float nilai_lain_lain = 0;
        float nilai_uts = 0;
        float nilai_uas = 0;
        float nilai_akhir;

        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Masukan NIM Anda : ");
            try{
            nim = dataInput.readLine();
        }catch( IOException ex ) {
           System.out.println("Error " + ex);
        }

        System.out.println("Masukan nama Anda : ");
            try{
                nama = dataInput.readLine();
            }catch( IOException ex ){
                System.out.println("Error " + ex);
            }

        System.out.println("Masukan mata kuliah : ");
            try{
                mata_kuliah = dataInput.readLine();
            }catch( IOException ex ){
                System.out.println("Error! " + ex);
            }

        System.out.println("Masukan nilai lain-lain : ");
            try{
                nilai_lain_lain = Float.parseFloat(dataInput.readLine());
            }catch( IOException ex ){
                System.out.println("Error " + ex);
            }

        System.out.println("Masukan nilai uts : ");
            try{
                nilai_uts = Float.parseFloat(dataInput.readLine());
            }catch( IOException ex ){
                System.out.println("Error " + ex);
            }

        System.out.println("Masukan nilai uas :");
            try{
                nilai_uas = Float.parseFloat(dataInput.readLine());
            }catch( IOException ex ){
                System.out.println("Error! "+ ex);
            }
        
        //nilai akhir = (0.4F *niali lain2) + (0.3F * nilai uts) + (0.3F *nilai uas)
        nilai_akhir = (0.4F * nilai_lain_lain) + (0.3F * nilai_uts) + (0.3F * nilai_uas);

        if(nilai_akhir>=80){
            System.out.println("Grade A");
        }else if(nilai_akhir>=76 && nilai_akhir<=79){
            System.out.println("Grade AB");
        }else if(nilai_akhir>=71 && nilai_akhir<=75){
            System.out.println("Grade B");
        }else if(nilai_akhir>=66 && nilai_akhir<=70){
            System.out.println("Grade BC");
        }else if(nilai_akhir>=61 && nilai_akhir<=65){
            System.out.println("Grade C");
        }else if(nilai_akhir>=56 && nilai_akhir<=60){
            System.out.println("Grade CD");
        }else if(nilai_akhir>=51 && nilai_akhir<=55){
            System.out.println("Grade D");
        }else if(nilai_akhir>=50){
            System.out.println("Grade E");

        }

    }
}