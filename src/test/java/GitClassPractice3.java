public class GitClassPractice3 {
    public static void main(String[] args) {
        //reverse a String using StringBuilder

        String word = "Apocalyptic";

        StringBuilder word1 = new StringBuilder();
        word1.append(word).reverse();
        String reversedString = word1.toString();
        System.out.println(reversedString);

    }
}
