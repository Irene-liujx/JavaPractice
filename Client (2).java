package 桥接模式;

public class Client {
    public static void main(String[] args) {
        VideoFile vf;
        Operationplatform osType1 = new Windowsplatform();
        vf = new RMVB();
        osType1.setVideo(vf);
        osType1.play("七龙珠");

        Operationplatform osType2 = new Linuxplatform();
        vf = new AVI();
        osType2.setVideo(vf);
        osType2.play("火影忍者");

        Operationplatform osType3 = new Unixplatform();
        vf = new MPEG();
        osType3.setVideo(vf);
        osType3.play("数码宝贝");
    }
}