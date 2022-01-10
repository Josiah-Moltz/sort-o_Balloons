// Balloons (Weichen Liu, Josiah Moltz, Sophia Eiden)
// APCS pd6
// Lab04 -- SORTS
// 2022-01-06
// time spent:  1.5 hrs

import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    int size = 1000;
    Sorts balloons = new Sorts();

    ArrayList al = new ArrayList<Integer>();
    for ( int i = 0; i < size; i++ ) {
      al.add(size-i);
    }

    //WORST CASE BOOO!!
    System.out.println("Testing worst case on size: " + size);
    System.out.println("==============");

    System.out.println("Bubble sort");
    balloons.bubble(al);
    for ( int i = 0; i < 1000; i++ ) {
      al.set(i,1000-i);
    }

    System.out.println("\nSelection sort");
    balloons.selection(al);
    for ( int i = 0; i < 1000; i++ ) {
      al.set(i,1000-i);
    }

    System.out.println("\nInsertion sort");
    balloons.insertion(al);

    //BEST CASE WOOO!!
    System.out.println("\nTesting best case on size: " + size);
    System.out.println("==============");

    System.out.println("Bubble sort");
    balloons.bubble(al);

    System.out.println("\nSelection sort");
    balloons.selection(al);

    System.out.println("\nInsertion sort");
    balloons.insertion(al);
  }

}
