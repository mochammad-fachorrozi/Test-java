import java.util.regex.Pattern;
import java.util.regex.MatchResult;
import java.util.Arrays;

public class Main {

    public static void main(String []args) {
        // Validate if a string is a date
        boolean isMatch = Pattern.compile("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$")
                .matcher("12/12/2022")
                .find();
        System.out.println(isMatch); // prints true

        String email = Pattern.compile(\"\\\\b[\\\\w.%-]+@[-.\\\\w]+\\\\.[A-Za-z]{2,4}\\\\b\");
        String tanggal = Pattern.compile("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$")
        // Extract date from a string
//        String[] matches = Pattern.compile("[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}")
//                .matcher("I\'m on vacation from 1/18/2021 till 1/29/2021")
//                .results()
//                .map(MatchResult::group)
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(matches)); // prints [1/18/2021, 1/29/2021]
    }
}