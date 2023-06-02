package Interview;

public class revarray {
    public static void main(String[] args) {


        int[] arr = new int[]{167, 290, 30, 49, 587};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


