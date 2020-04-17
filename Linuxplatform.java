package 桥接模式;

public class Linuxplatform extends Operationplatform{
    public void play(String fileName) {
        String osType = "Linux";
        this.vf.decode(osType,fileName);
    }

}
