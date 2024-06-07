public class Class2InBranch1 {
    public static void main(String[] args) {
        //reverse a String using String Methods

        String word = "beautifully";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("Word is " + "' " + word + " '");
        System.out.println("Reversed Word is " + "' " + reversedWord + " '");
    }
}
