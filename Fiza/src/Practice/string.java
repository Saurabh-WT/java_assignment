package Practice;

public class string {
    public static void main(String[] args) {
        int a[] = new int[26];
        String s1 = "madame";
        String s2 = "madam";
        int n1 = s1.length();
        int n2 = s2.length();
        for(int i =0; i<n1; i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i =0; i<n2; i++){
            a[s2.charAt(i)-'a']--;
        }
        for(int j =0; j<26; j++){
            if(a[j]==1){
                System.out.println((char)(j+'a'));
            }
        }
    }
}
