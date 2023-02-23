public class MotorCar extends Transport {
    private boolean startEngine;
    public MotorCar (String brend, int year, int speed, int capacity){
        super(brend,year,speed,capacity);
        this.startEngine=false;

    }

    public void startEngine(){
        this.startEngine=true;
    }
    public void stopEngine (){
        this.startEngine=false;
    }
    @Override
    public void go(Route route){
        if (startEngine){
            super.go(route);
        } else {
            System.out.println("Двигатель не заведен");
        }
    }

    @Override
    public String toString(){
        String status;
        if (this.startEngine) {
            status="Двигатель заведен";
        } else {
            status="Двигатель не заведен";
        }
        return super.toString()+status+"\n";
    }

}