package CodingTestingDemo;

public class countcharacter {
    public static void main(String[] args) {
        String str="The best version of me is myself";
        int count=0;
        System.out.println(str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')

                count++;
        }
        System.out.println("Total number of characters "+count);
    }
}
