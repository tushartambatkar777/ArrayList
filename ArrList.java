package ArrayList;
import java.util.ArrayList;

public class ArrList{
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.add(1, 9);
    System.out.println(list);

    //Get Operation
    // int ele = list.get(2);
    // System.out.println(ele);

    // Delete 
    // list.remove(2);
    // System.out.println(list);

    //Set
    // list.set(2, 10);
    // System.out.println(list);

    //contains
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(11));

    System.out.println(list.size());

    //print the ArrayList
    for(int i=0; i<list.size(); i++) {
      System.out.print(list.get(i)+ " ");
    }
    System.out.println();
  }
}