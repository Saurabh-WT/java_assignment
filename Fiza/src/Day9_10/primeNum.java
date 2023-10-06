package Day9_10;

public class primeNum {
    public static void main(String[] args) {

        int n =50;
        for(int i = 1; i<=n; i++){
            int c= 0;
            for(int j = 2; j*j<=i; j++){
                if(i%j==0){
                    c++;
                    //break;
                }

            }
            if(c==0){
                System.out.println(i);
            }
        }
    }
}
