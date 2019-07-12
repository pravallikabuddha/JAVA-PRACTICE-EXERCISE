// conversion of char array to string
public class test4 {
    public static void main(String[] args) {
        char[] ch = {'p', 'r', 'o', 'l', 'i','f','i','c','s'};
        String str = String.valueOf(ch);
        String str2 = new String(ch);
        System.out.println(str);
        System.out.println(str2);
    }
}