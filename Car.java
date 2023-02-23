public class Car extends MotorCar{
    private boolean autoGear;
    public Car(String brend, int year, int speed, int capacity,boolean autoGear){
        super(brend,year,speed,capacity);
        this.autoGear=autoGear;


    }
    @Override
    public String toString(){
        String gear;
        if (this.autoGear) {
            gear="Коробка-автомат";
        } else {
            gear="Механическая коробка";
        }
        return super.toString()+gear+"\n";
    }
}
