import java.util.Scanner;

public class Class3InBranch1 {
    public static void main(String[] args) {
        //take a String from a customer and reverse it

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any word");
        String str = scanner.nextLine();
        String strReversed = "";
        for(int i = str.length()-1; i >=0; i--){
            strReversed += str.charAt(i);
        }
        System.out.println(strReversed);
    }
}
