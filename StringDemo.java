package B12_02;

public class StringDemo{
    public static void main(String[] args) {
        String command = "say hello to me";
        String[] s = command.split(" ");
        System.out.println(Arrays.toString(s));

        String[] subdomain = {"www","baidu","com"};
        String s1 = String.join(".",subdomain);
        System.out.println(s1);

        String s2 = "hello";
        String s3 = s2.concat("haha");
        System.out.println(s3);


    }

}