// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // List emails = new ArrayList();
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("user@domain.com");
        emails.add("user#domain.co.id");

        String regexEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern patternEmail = Pattern.compile(regexEmail);

        System.out.println("Data email yang valid atau tidak :");
        for(String email : emails){
            Matcher matcher = patternEmail.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }

        //format dd-MM-yyyy
        ArrayList<String> dates = new ArrayList<String>();
        dates.add("01-12-2000");
        dates.add("01-13-2000");

        String regexDate = "(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])-(0[1-9]|1[0-2]|[1-9])-([0-9]{4})";
        Pattern patternDate = Pattern.compile(regexDate);

        System.out.println("");
        System.out.println("Data tanggal dengan format dd-MM-yyyy : ");
        for(String date : dates){
            Matcher matcher = patternDate.matcher(date);
            System.out.println(date +" : "+ matcher.matches());
        }

        // format ip addres
        ArrayList<String> ips = new ArrayList<String>();
        ips.add("192.168.0.1");
        ips.add("192.168.0.256");

        // Regex for digit from 0 to 255.
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";
        String regexIp
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern patternIp = Pattern.compile(regexIp);

        System.out.println("");
        System.out.println("Data Ip Address  : ");

        for(String ip : ips){
            Matcher matcher = patternIp.matcher(ip);
            System.out.println(ip +" : "+ matcher.matches());
        }
    }
}