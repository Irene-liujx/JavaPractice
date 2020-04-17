package 桥接模式;

public class Unixplatform extends Operationplatform{
    public void play(String fileName) {
        String osType = "Unix";
        this.vf.decode(osType,fileName);
    }

}

