import java.nio.file.Files;
import java.nio.file.Path ;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
public class Launcher { // (1)
    public static void main(String[] args) throws IOException { // (2)
        System.out.println("Salut L'Ami"); // (3)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ecrire la commande: ");
        String scan = scanner.next();
        String  quit_variable = "quit";
        String fibo_variable = "fibo";
        String freq_variable = "freq";
        while(!scan.equals(quit_variable) && !scan.equals(fibo_variable) && !scan.equals(freq_variable))
        {
            System.out.println("Unknown Command");
            System.out.print("Ecrire la commande: ");
            scan = scanner.next();

        }
        if(scan.equals(fibo_variable))
        {
            System.out.print("Quel est ton nombre: ");
            int nombre = scanner.nextInt();
            int i = 0;
            int fibo = 0;
            if(nombre == 0)
            {
                System.out.print("0");
            }
            if(nombre == 1)
            {
                System.out.print("1");
            }
            else if(nombre != 0 || nombre != 1)
            {
                for(i = 0;i <= nombre; i++) {
                    fibo +=i;
                }
                System.out.print(fibo);
            }
        }
        if(scan.equals(freq_variable))
        {
            System.out.print("Quel est le path: ");
            String chemin = scanner.next();
            Path path1 = Paths.get(chemin);

            String content =  Files.readString(path1);

            content = content.replaceAll("!"," ");
            content = content.replaceAll("_"," ");
            content = content.replaceAll("-"," ");
            content = content.toLowerCase();
            String[] words =  content.split(" ");
            System.out.println(content);
            /*for (String word : words) {
                System.out.println(word);
            }*/
            //Stream<String> stream = Arrays.stream(words);
            List<String> items = Arrays.asList(words);
            Map<String,Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            Map<String,Long> finalMap = new LinkedHashMap<>();
            result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
            List<String> keyList = new ArrayList(finalMap.keySet());

            List<String> sortedList = keyList.stream().collect(Collectors.toList());
            List<String> FirstSortedList = sortedList.stream().limit(3).collect(Collectors.toList());

            System.out.println(FirstSortedList.get(0)+ " " + FirstSortedList.get(1)+ " " + FirstSortedList.get(2));

        }
    }
}