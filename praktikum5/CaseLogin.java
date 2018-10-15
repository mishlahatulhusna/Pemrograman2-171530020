import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CaseLogin {

    public static void main(String[] args ) throws IOException  {
        
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

        String id_user, password;
        boolean status = true;

        do {
            System.out.println("Masukan ID. User : ");
            id_user = dataInput.readLine();

            System.out.println("Masukan password : ");
            password = dataInput.readLine();

            if(!id_user.equals("171530020")) {
                System.out.println("ID. User yang anda masukan salah!");
            }else{
                if(!password.equals("mahasiswa123")){
                    System.out.println("Password yang anda masukan salah!");
                }else{
                    status = false;
                }
            }

        }while(status);

        System.out.println("Selamat Datang : " + id_user);
        
    }
}
