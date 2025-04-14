import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //what we have
        String fullName = "Karla Castillo Garcia";

        //what we want
        //    String nameList={"Karla", "Castillo", "Garcia"};

        //how? split!
        String[] nameList = fullName.split(" "); //" "(space) is the delimiter (aka place we want to cut it up, spaces in a sentence, where we cut apart: parse)

        for(String n: nameList){
            System.out.println(n);
        }

        String[] fruit = {"Apple", "Banana", "Cherry"};
        String text = String.join(" ", fruit); // glue together
        System.out.println(text);

        //fast but not too weird or sophisticated
        StringBuilder sb = new StringBuilder();
        sb.append("first");
        sb.append(" ");
        sb.append("second");
        sb.append(" ");
        sb.append("third");
        System.out.println(sb);

        // slow but familiar
//        String body1 = "";
//        body1 += "first";
//        body1 += "second";
//        body1 += "third";
//        System.out.println(body1);
//
//        // awkward but faster choice
//        ArrayList<String> body = new ArrayList<>();
//        body.add("first");
//        body.add("second");
//        body.add("third");
//        System.out.println(String.join(" ", body));
    }
}