package 桥接模式;
public abstract class Operationplatform {
    protected VideoFile vf;

    public void setVideo(VideoFile vf) {
        this.vf = vf;
    }

    public abstract void play(String fileName);
}

