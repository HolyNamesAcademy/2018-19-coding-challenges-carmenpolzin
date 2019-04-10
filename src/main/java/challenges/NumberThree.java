package challenges;
import java.util.ArrayList;
/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
 * Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
 *
 * The method should return a new string representing the input time in 24 hour format.
 *
 * timeConversion has the following parameter(s):
 *
 * Example:
 * s: 07:05:45AM
 * return: 07:05:45
 *
 * Example:
 * s: 07:05:45PM
 * return: 19:05:45
 *
 * @param s a string representing time in 12 hour format
 * @return the string s in 24 hour format
 */

public class NumberThree {

    public String timeConversion(String s) {

        if (s.contains("AM")) {
            String[] newImproved = s.split(":");
            if (newImproved[0].equals("12")) {
                newImproved[0] = "00";
                return newImproved[0] + ":" + s.substring(3, 8);
            } else
                return s.substring(0, 8);
        }



        if(s.contains("PM")){
            String [] newImproved  = s.split(":");
            int result = Integer.parseInt(newImproved[0]);
            if(result == 12)
                return s.substring(0,8);
            int a = result+= 12;
            String endResult = Integer.toString(a);
            return endResult + ":" + s.substring(3,8);
        }

        return "didn't work";

    }
}
