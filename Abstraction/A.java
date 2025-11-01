abstract class A{
    int x=5;
    static int a=20;
    static void m1(){
        System.out.println("A's static method m1");
    }
    void m2(){
        System.out.println("A's instance method m2");
    }
    public static void main(String[] args) {
        System.out.println("A's main method");
    }
}