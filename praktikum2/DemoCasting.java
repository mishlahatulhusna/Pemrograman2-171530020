public class DemoCasting {

    public static void main(String[] args){
        //casting implisit
        byte b = 100;
        int i = b;

        //casting elsplisit
        byte x = 1000;
        byte y = (byte) x;
        System.out.println("casting byte y : + y");

        double j = 10.5;
        int k = (int) j;
        System.out.println("casting byte k : + k");

        j = 10.2;
        int l = (int) j;
        System.out.println("casting byte l : + l");

        j = 10.8;
        short m = (short) j;
        System.out.println("casting byte m : + m");
    }
}