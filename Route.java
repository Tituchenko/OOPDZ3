public class Route {
    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    private String name;
    private double distance;

    public Route getFrom() {
        return from;
    }

    private Route from;

    public Route (String name){
        this.name=name;
    }

    public static void setDistance (Route route1,Route route2,double distance){
        route1.from=route2;
        route2.from=route1;
        route1.distance=distance;
        route2.distance=distance;
    }

}
