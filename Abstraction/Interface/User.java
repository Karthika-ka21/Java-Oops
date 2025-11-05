 class User {
    public static void main(String[] args){
        Services s = new Services();
        Uber car = new Car();
        Uber bike = new Bike();
        Uber auto = new Auto();
        s.startRide(auto);
        s.endRide(auto);
        s.startRide(car);
        s.endRide(car);
        s.startRide(bike);
        s.endRide(bike);
    }
}
