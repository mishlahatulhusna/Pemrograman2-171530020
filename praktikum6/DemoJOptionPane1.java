import javax.swing.JOptionPane;

public class DemoJOptionPane1 {

    public static void main(String[] args){
    String nim="", nama="", tempat="", tgllahir="";

    nim = JOptionPane.showInputDialog("Inputkan nim anda : ");
    nama = JOptionPane.showInputDialog("Inputkan nama anda : ");
    tempat = JOptionPane.showInputDialog("Inputkan tempat lahir anda : ");
    tgllahir = JOptionPane.showInputDialog("Inputkan tgllahir anda : ");

    String msg = "Selamat datang " + nama + " ! \nNIM : " + nim + "\nTempat Lahir : " + tempat + "\nTanggal lahir : " + tgllahir;
    JOptionPane.showInputDialog(null, msg);
    }
}