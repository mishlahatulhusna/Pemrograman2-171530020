public class DemoArray2 {

    public static void main(String args[] ){
        //contoh program pencarian

        String names[] = {"adi", "aji", "abbi", "abdul", "hasif"};
        String searchName = "abbi";
        boolean foundName = false;
        for( int i=0; i< names.length; i++){
            if( names[i].equals( SearchName )){
                foundName = true;
                break;
            }
        }
         
        if( foundName ){
            System.out.println( SearchName + " found! ");
        }else{
            System.out.println( SearchName + " not found. ");
        }

    }
}