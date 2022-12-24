package JavaAlishev;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        /////////// to Java 5 ///////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////////////// After Java 5 //////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("eagle");
        animals2.add("horse");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        /////////////// Java 7 ////////////////////
        List<String> animals3 = new ArrayList<>();
        animals3.add("cow");

        String animal3 = animals3.get(0);
        System.out.println(animal3);
    }
}
