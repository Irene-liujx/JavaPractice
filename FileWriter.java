package 外观模式;

public class FileWriter {
    public void write(String EncryText,String FileNameDes){
        String et = EncryText;
        String fnd = FileNameDes;
        System.out.println("加密后文件: " + et);
        System.out.println("---------------------------");
        System.out.println("目标文件存放路径为: " + fnd);
    }
}
