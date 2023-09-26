package Practice;

import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {
        Stream.iterate(1, x->x+1)    //performs iteration
                .filter(x->x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println); //Consumer interface
    }
}
