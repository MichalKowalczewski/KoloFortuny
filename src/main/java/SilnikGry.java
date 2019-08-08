import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SilnikGry {

    private String zdanieDoOdgadniecia;
    private String ukryteZdanie;
    private StringBuilder sb;

    public String ukryjZdanie(String zdanie){
        zdanieDoOdgadniecia = zdanie;
        char[] zdanieArray = zdanie.toCharArray();
        zdanie = "*".repeat(zdanie.length());
        sb = new StringBuilder(zdanie);

        IntStream.range(0, zdanieArray.length)
                .filter(value -> zdanieArray[value] == ' ')
                .forEach(value -> sb.setCharAt(value, ' '));

        zdanie = sb.toString();
        ukryteZdanie = zdanie;

        return zdanie;
    }

    public String znajdzLiteryWZdaniu(char c){
        char[] chars = zdanieDoOdgadniecia.toCharArray();



        IntStream.range(0, chars.length)
                .filter(value -> chars[value] == c)
                .forEach(value -> sb.setCharAt(value, c));

        return sb.toString();
    }
}
