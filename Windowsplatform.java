package 桥接模式;

public class Windowsplatform extends Operationplatform{
    public void play(String fileName) {
        String osType = "Windows";
        this.vf.decode(osType,fileName);
    }

}
