 class Test {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        Dog d = new Dog();
        Cat c = new Cat();
        h.vaccination(d);
        h.vaccination(c);
        h.vaccination(new Lion());
    }
    
}
