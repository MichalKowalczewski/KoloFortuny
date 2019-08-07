import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String str = "Hasło programu naszego";
        final List<Character> listOfChars = str.chars().mapToObj(c ->(char) c).collect(Collectors.toList());
        List<Integer> listOfSpaces = new ArrayList<>();
        str = "*".repeat(str.length());
        StringBuilder sb = new StringBuilder(str);

        IntStream.range(0, listOfChars.size())
                .filter(value -> listOfChars.get(value) == ' ')
                .forEach(value -> sb.setCharAt(value, ' '));

        str = sb.toString();

        System.out.println(str);




    }
}
