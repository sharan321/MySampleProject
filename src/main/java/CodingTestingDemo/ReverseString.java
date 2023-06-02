package CodingTestingDemo;

public class ReverseString {
    public static void main(String[] args) {
        String str="Dream big ";

        String strrev=" ";

        for(int i=str.length()-1;i>=0;i--)
        {
            strrev=strrev+str.charAt(i);

        }
        System.out.println("Original String "+str);
        System.out.println("Reversed String"+strrev);
    }
}
