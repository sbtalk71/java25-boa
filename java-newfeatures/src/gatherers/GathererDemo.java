package gatherers;

import java.util.List;
import java.util.stream.Gatherers;

public class GathererDemo {
    static void main() {
        List<Integer> numbers=List.of(5,10,15,20,25,30,35,40);

       List<List<Integer>> windows= numbers.stream().gather(Gatherers.windowFixed(3)).toList();
       windows.forEach(System.out::println);


        List<List<Integer>> slidingwindows= numbers.stream().gather(Gatherers.windowSliding(4)).toList();

        slidingwindows.stream().map(window->window.stream().mapToInt(Integer::intValue).average().orElse(0)).forEach(System.out::println);
    }
}
