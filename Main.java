public class Main {
    public static void main(String[] args) {
        Route moscow=new Route("Москва");
        Route spb=new Route("Санкт-Петербург");
        Route.setDistance(moscow,spb,750);

        Bus bus1=new Bus("Mercedes",2005,140,80,"Автобусный парк №1");
        System.out.println(bus1);
        bus1.go(moscow);
        bus1.startEngine();
        bus1.go(moscow);
        System.out.println(bus1);

        Car car1= new Car("ВАЗ",1989,100,4,false);
        car1.startEngine();
        car1.go(spb);
        System.out.println(car1);



    }
}