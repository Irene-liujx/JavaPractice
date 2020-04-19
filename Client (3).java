package 外观模式;

public class Client {

    public static void main(String[] args){
        try{
            String text = "model";
            String address = "c:\\设计模式";
            EncryptFacade ec = new EncryptFacade();
            ec.fileEncrypt(text,address);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
