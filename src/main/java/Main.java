import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        SilnikGry silnikGry = new SilnikGry();
        String line;
        List<Pytanie> pytania = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String litera;

        File file = new File("pliki\\Zdania.txt");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while((line = bufferedReader.readLine()) != null){
                String[] linie = line.split(";");
                pytania.add(new Pytanie(linie[0], linie[1]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pytanie pytanie = pytania.get(random.nextInt(pytania.size()-1));


        System.out.println(silnikGry.ukryjZdanie(pytanie.getZdanie()) + " Kategoria " + pytanie.getKategoria());

        while (true){
            if((litera = scanner.nextLine()).length() == 1){
                System.out.println(silnikGry.znajdzLiteryWZdaniu(litera.charAt(0)));
            }
            else {
                System.out.println("podano złą wartość");
            }
        }

    }
}
