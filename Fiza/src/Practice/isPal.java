package Practice;

public class isPal {
    public static void main(String[] args) {
        String str = "aabbaa";
        int s =0;
        int e = str.length()-1;
        System.out.println(pal(str, s, e));
    }
    static boolean pal(String str, int s, int e){
        if(s>=e)
            return true;
        return str.charAt(s)==str.charAt(e) && pal(str, s+1, e-1);
    }
}
