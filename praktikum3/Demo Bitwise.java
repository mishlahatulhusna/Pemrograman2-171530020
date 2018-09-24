public class DemoBitwise {
    public static void main(String args[]) {
        int x= 5, y= 6;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.pritnln("x & y = " + (x & y));
        System.out.pritnln("x | y = " + (x | y));
        System.out.pritnln("x ^ y = " + (x ^ y));

        //komplemen
        int z = 6;
        System.out.pritnln("z = " + z);

        int a = ~z;
        System.out.pritnln("a = " + a);
    }
}