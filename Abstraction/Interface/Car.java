 class Car implements Uber {
    @Override
    public void bookRide() {
        System.out.println("Car ride booked successfully.");
    }

    @Override
    public void cancelRide() {
        System.out.println("Car ride cancelled successfully.");
    }
}
