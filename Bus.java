public class Bus extends MotorCar{
    private String parkBus;
    public Bus (String brend, int year, int speed, int capacity,String parkBus){
        super(brend,year,speed,capacity);
        this.parkBus=parkBus;
    }

    @Override
    public String toString (){
        return super.toString()+"Парк:"+this.parkBus+"\n";
    }
}
