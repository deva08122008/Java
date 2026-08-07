import java.io.*;
import java.util.*;

class Result {

    public static String timeConversion(String s) {
        String ampm = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (ampm.equals("AM")) {
            if (hour == 12) {
                return "00" + s.substring(2, 8);
            }
            return s.substring(0, 8);
        } else { // PM
            if (hour != 12) {
                hour = hour + 12;
            }
            return hour + s.substring(2, 8);
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}
