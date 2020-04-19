package 外观模式;

public class FileReader {
    public String read(String fileNameSrc){
        String fns = fileNameSrc;
        System.out.println("原文件:" + fns);
        System.out.println("---------------------------");
        return fns;
    }
}
