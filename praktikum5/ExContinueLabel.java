  // percobaan 4 = loop continue berlabel

  public class ExContinueLabel {

      public static void main(String[] args ) {
          outerLoop:
          for( int i=0; i<5; i++){
              for ( int j=0; j<5; j++){
                  //message
                System.out.println("inside for(j) loop");
                if( j == 2 ) continue outerLoop;
            }
            //message
            System.out.print("inside for(i) loop");
        }
    }

}

// sudah benar