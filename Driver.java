// Balloons (Weichen Liu, Josiah Moltz, Sophia Eiden)
// APCS pd6
// Lab06 -- SORTS
// 2022-01-06
// time spent:  0.8 hrs

import java.util.ArrayList;

public class Driver {
  public static void main(String[] args) {
    Sorts balloons = new Sorts();

    ArrayList al = new ArrayList<Integer>();
    for ( int i = 0; i < 1000; i++ ) {
      al.add(1000-i);
    }

    //WORST CASE BOOO!!
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
    System.out.println("\nBubble sort");
    balloons.bubble(al);

    System.out.println("\nSelection sort");
    balloons.selection(al);

    System.out.println("\nInsertion sort");
    balloons.insertion(al);
  }

}
