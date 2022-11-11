import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

    private static final Set<String> set1 = Stream.of("GOL", "SMARTSHOP")
            .collect(Collectors.toCollection(HashSet::new));

    public static void main(String[] args){


        System.out.println("Set 1: " + set1);

        if(set1.contains("SMARTSHOP"))
            System.out.println("SMARTSHOP");
        else
            System.out.println("ayyooo");


    }
}
