package Practice;

public class recursion {
    public static void main(String[] args) {
        int n =5;
        System.out.println(print(n));
    }
    static  int print(int n){
        if(n==0){
            return 0;
        }
        return n+print(n-1);
    }
}
