package B11_25;

public class MountainBike extends Bike {

    MountainBike(){
        super();
    }

    public int getSpeed(int x){
        return 100;
    }

    @Override
    public int getSpeed(){
        return 500;
    }

    @Override
    public String toString(){
        return " ";
    }

    public static void main(String[] args) {
        MountainBike mb = new MountainBike();
        System.out.println(mb.getSpeed());
        System.out.println(mb.getSpeed(10));
    }
}
