
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knowx
 */
public class Testing {
    public static void main(String []args){
        List<Integer> l1 = new ArrayList<Integer>();

l1.add(1);
l1.add(2);
l1.add(3);
l1.add(2);
l1.add(2);
l1.add(9);



List<Integer> l2= new ArrayList<Integer>();
l2.add(4);
l2.add(2);
l2.add(3);
l2.add(6);
l2.add(7);

System.out.println("l1 == "+l1);
System.out.println("l2 == "+l2);

List<Integer> l3 = new ArrayList<Integer>(l2);
l3.retainAll(l1);

    System.out.println("l3 == "+l3);
    System.out.println("l1 == "+l1);
    
    l2.removeAll(l3);
    System.out.println("l2 == "+l2);
    }
}
