package Practice;

import java.util.Arrays;

public class ComparableInterface {
    public static void main(String[] args) {
        Point arr[] = {new Point(10, 20), new Point(3,12), new Point(5, 7)};
        Arrays.sort(arr);
        //Arrays.binarySearch(arr, 10);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i].x+"  "+arr[i].y);
        }
    }
}
class Point implements Comparable<Point>{
    int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Point p) {
        return this.x-p.x;
    }
}
