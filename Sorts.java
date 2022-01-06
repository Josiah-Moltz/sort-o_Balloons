public class Sorts {
  //Bubble Sort
  public static void bubble( ArrayList<Comparable> data )
  {
    for( int passNum = 0; passNum < data.size(); passNum++ ) {
      for( int i = data.size() - 1; i > passNum; i-- ) {
        if ( data.get(i).compareTo( data.get(i - 1) ) < 0 ) {
          data.set( i, data.set( i - 1, data.get(i) ) );  // COOL SWAPPING B)
        }
      }
    }
  }

  //Selection Sort
  public static void selection( ArrayList<Comparable> data )
  {
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for( int pass = data.size()-1; 0 < pass; pass-- ) {
      maxPos = 0; //If we don't reassign maxPos we will just end up reusing the largest value from the previous sort
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      for( int i = pass; 0 <= i; i-- ) {
        if ( data.get(maxPos).compareTo(data.get(i)) < 0 ) {
          maxPos = i;
        }
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
      }

      data.set( pass, data.set( maxPos, data.get(pass) ) );
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort

  //Insertion Sort
  public static void insertion( ArrayList<Comparable> data )
  {
    for(int partition = 1; partition < data.size(); partition ++) {
      //partition marks first item in unsorted region

      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );

      //traverse sorted region from right to left
      for(int i = partition; i > 0; i --) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0 ) {

          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          data.set(i , data.set(i - 1, data.get(i)));

        }
        else
          break;
      }
    }
  }//end insertionSortV

  
}
