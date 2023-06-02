package CodingTestingDemo;


    // Java program to Demonstrate List Interface

// Importing all utility classes
import java.util.*;
class CollecArray{
    // Main class
// ListDemo class
        // Main driver method
        public static void main(String[] args)
        {

            // Creating an object of List interface
            // implemented by the ArrayList class
            List<Integer> l1 = new ArrayList<Integer>();

            // Adding elements to object of List interface
            // Custom inputs

            //l1.add(0, 1);
           // l1.add(1, 2);
            l1.add(0,1);
            l1.add(1,2);


            // Print the elements inside the object
            System.out.println("l1 elements are : "+l1);

            // Now creating another object of the List
            // interface implemented ArrayList class
            // Declaring object of integer type
            List<Integer> l2 = new ArrayList<Integer>();

            // Again adding elements to object of List interface
            // Custom inputs
            l2.add(1);
            l2.add(2);
            l2.add(3);
            System.out.println("l2 elements are : "+l2);

            ArrayList myList=new ArrayList();
            myList.add(201);
            myList.add("John");
            myList.add(10.5);
            myList.add(true);
            myList.add(null);
            myList.add(201);

            System.out.println("Array myList elements are:"+myList);
            System.out.println("Size of Array myList elements is : "+myList.size());

            System.out.println("Demo for HashSet");
            HashSet mySet= new HashSet();
            mySet.add(10.5);
            mySet.add(100);
            mySet.add('A');
            mySet.add(true);
            mySet.add("welcome");
            mySet.add(100);
            mySet.add("welcome");
            mySet.add(null);
            mySet.add(null);
            System.out.println("mySet"+mySet);
            System.out.println("mySet size is: "+mySet.size());


            System.out.println("Demo for HashMap");

            HashMap map=new HashMap();
            map.put(101,"John");
            map.put(102,"Sam");
            map.put(103,"Ravi");
            map.put(104,"Raby");
            map.put(105,"Abeeb");
            map.put(101,"John");
            map.put(102,"Ram");

            System.out.println("map elements are "+map);
            map.remove(102);

            System.out.println("map after removing elements are "+map);
            System.out.println("map after keyset "+map.keySet());

            for(Object k:map.keySet())
            {
                System.out.println(k+""+map.get(k));
            }
            List myli=new ArrayList();
            myli.add(10);
            myli.add("Sam");
            myli.add(10.5);
            System.out.println("Mylist elements are"+myli);
            System.out.println(myli.size());
        }
    }


