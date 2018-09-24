public class DemoBoolean {

    public static void main(String[] args) {
        // And : & dan &&
        int a=5, b=7;
        if ((a<2) & (b++<10)) {
            b+=2;
            System.out.println(b);  //tidak dicetak
        }
        
        int c=5, d=7;
        if ((c<2) && (d++<10)) {
            d+=2;
            System.out.println(d);  // tidak dicetak     
        }

        // or : | dan ||
        int e=5, f=7;
        if ((e<2) | (f++<10)) {     // (8 + 2 = 10)
            f+=2; 
            System.out.println(f);  //dicetak = 10
        }

        int g=5, h=7;
        if ((g<2) && (h++<10)) {
            h+=2;
            System.out.println(h); //dicetak = 10
        }
    }   

}