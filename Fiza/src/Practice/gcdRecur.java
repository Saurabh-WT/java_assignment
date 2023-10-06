package Practice;

public class gcdRecur {
    public static void main(String[] args) {
        int n =5;
        System.out.println(print(n));

    }
    static int print(int n){

        if(n<=1){
            return 1;
        }
        return print(n-1)*(n);
    }
}
