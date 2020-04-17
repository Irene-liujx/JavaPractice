package 桥接模式;

public class AVI implements VideoFile {
    public void decode(String osType, String fileName) {
        System.out.println("操作系统--"+osType+"以-" + "AVI" + "-格式播放文件:" +fileName);
    }

}
