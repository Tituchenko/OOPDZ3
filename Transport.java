public class Transport {
    private String brend;
    private int year;
    private int speed;
    private int capacity;
    private Route route;

    public Transport(String brend, int year, int speed, int capacity) {
        this.brend = brend;
        this.year = year;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void go(Route route){
        this.route=route;
    }
    @Override
    public String toString (){
        String routeString;
        if (this.route==null){
            routeString="";
        } else {
            if (this.route.getFrom()==null) {
                routeString = "Маршрут:" + this.route.getName() + "\n";
            } else{
                routeString = "Маршрут:" + this.route.getName() + " - " + this.route.getFrom().getName()+ "\n";
                routeString+="Дистанция:" + this.route.getDistance()+"\n";
            }
        }

        return "Марка:"+this.brend+"\n"+
                "Год:"+this.year+"\n"+
                "Скорость:"+this.speed+"\n"+
                "Вместимость:"+this.capacity+"\n"+
                routeString;

    }
}
