package Practice;

public class Strings {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "geeks";
        System.out.println(s1==s2);
        String s3 = new String("geeks");
        System.out.println(s3.equals(s1));
        s1 = s1+"for";
        System.out.println(s1.concat("lk"));
        StringBuffer sb = new StringBuffer("gdk");
        System.out.println(s1);
        //System.out.println(sb.concant("kl"));
        System.out.println(sb.append("kh"));
        System.out.println(sb.insert(2, s2));
        System.out.println(sb.replace(0,5,"ab"));
    }
}
