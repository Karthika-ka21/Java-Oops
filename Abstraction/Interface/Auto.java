class Auto implements Uber{
    @Override
    public void bookRide() {
        System.out.println("Auto ride booked successfully.");
    }

    @Override
    public void cancelRide() {
        System.out.println("Auto ride cancelled successfully.");
    }
}