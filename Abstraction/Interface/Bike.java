class Bike implements Uber{
    @Override
    public void bookRide() {
        System.out.println("Bike ride booked successfully.");
    }
    @Override
    public void cancelRide() {
        System.out.println("Bike ride cancelled successfully.");
    }
}