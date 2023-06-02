package CodingTestingDemo;

public class CountOccurence {
    public static void main(String[] args) {
        String str="Java Programming Java Java";
        int tc=str.length();
        int tc_AR=str.replace("Java","").length();
        int tc1=str.replace("J","").length();
        int count=tc-tc_AR;
        int count1=tc-tc1;
        System.out.println("Count="+count);

        System.out.println("Count tc1="+count1);

    }
}
