public class DemoBreakLoop {

    public static void main(String[] args ) {
        int i = 1;
        do {
                System.out.println("iterasi ke " + i);
                i++;
                if (i > 10) break;
        }while (true);
    }

}