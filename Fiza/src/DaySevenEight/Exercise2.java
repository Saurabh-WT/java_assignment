package DaySevenEight;

public class Exercise2 {
    public static void main(String[] args) {

        Cir c = new Cir(2);
        c.cal_area();

        Rec r = new Rec(3,5);
        r.cal_area();

        Tri t = new Tri(4,7);
        t.cal_area();

    }

}
abstract class Shapes{
    abstract void cal_area();
}
class Cir extends Shapes{
    int r;
    Cir(int r){
        this.r = r;
    }
    void cal_area(){
        System.out.println(2*Math.PI*r*r);
    }
}
class Rec{
    int len;
    int breadth;
    Rec(int l, int b){
        this.len=l;
        this.breadth=b;
    }
    void cal_area(){
        System.out.println(len*breadth);
    }

}
class Tri{
    int base;
    int height;
    Tri(int b, int h){
        this.base=b;
        this.height=h;
    }
    void cal_area(){
        System.out.println((base*height)/2);
    }

}
