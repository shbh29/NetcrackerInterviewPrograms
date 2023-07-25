import java.util.TreeSet;

public class HelloWorld {

    //    public static void main(String args[]) {
//
//    }
    public static void main(String[] args) {
        String sb = "abcdabcde";
        TreeSet<String> setRep = new TreeSet<>();
        for (int i = 0; i < sb.length(); i++) {
            if (!setRep.add(""+sb.charAt(i))) {
                setRep.remove(""+sb.charAt(i));
            }
        }
        System.out.println("Last character is: " + setRep.first());
    }
}
