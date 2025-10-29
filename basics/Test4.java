//constructor overloading
class D {
    D(){
        System.out.println("no arg ctt");
    }
    D(int x){
        System.out.println("one arg ctt");
    }
}
class Test4{
    public static void main(String[] args){
        new D();
        new D(1);
    }
}