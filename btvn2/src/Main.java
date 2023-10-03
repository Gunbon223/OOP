public class Main {
    public static void main(String[] args) {
                String s=  "I love you";
                s = s + " forever";
                System.out.println(s);
                System.out.println(s.substring(0,8));
                String[] word= s.split(" ");
                String s1 = word[0];
                String s2 = word[1];
                String s3 = word[2];
                s2 = "hate";
                System.out.println(s1+" "+s2+" "+s3);
    }
}