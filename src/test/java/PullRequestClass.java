public class PullRequestClass {
    public static void main(String[] args) {
        //reverse a String with StringBuilder

        String str = "Afghanistan";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //////////////////////////////////////////
        StringBuilder word = new StringBuilder("Afghanistan1");
        word.reverse();
        System.out.println(word);
    }
}
