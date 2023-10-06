package Practice;

import java.util.Arrays;
import java.util.Collections;

public class ComparatorInterface {
    public static void main(String[] args) {
        Points arr[] = {new Points(9,4), new Points(3,6), new Points(8,1)};
        Arrays.sort(arr, Collections.reverseOrder());
    }
}
class Points {
    int x, y;
    Points(int x, int y){
        this.x=x;
        this.y=y;

    }

}
