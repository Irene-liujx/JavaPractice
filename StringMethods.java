package B12_02;

import java.io.UnsupportedEncodingException;

public class StringMethods {

    private static byte[] transform(byte[] b,String fromCharset,String toCharset) throws UnsupportedEncodingException {
        String s = new String(b,fromCharset);
        return s.getBytes(toCharset);
    }

    private static boolean isNumber(String s){
        for(char c : s.toCharArray()){
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] s = "中国人".getBytes("GB18030");
        for(byte b: s){
            System.out.printf("\\x%x",b);
        }
        System.out.println();
        byte[] p = transform(s,"GB18030","UTF-8");
        for(byte b : p){
            System.out.printf("\\x%x",b);
        }
        System.out.println();
    }
}
