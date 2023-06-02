package CodingTestingDemo;

import java.util.Arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int array[]={10,20,96,35,19,5};
        int size=array.length;
        Arrays.sort(array);
        System.out.println("Sorted Array is "+Arrays.toString(array));
        int max=array[size-3];
        //System.out.println(The 3rd largest element is %-15s+"\t"+max);
        System.out.println("The 3rd largest number is :"+"\t"+max);
    }
}
