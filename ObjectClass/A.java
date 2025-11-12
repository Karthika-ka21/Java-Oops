package oops.ObjectClass;
class A {
    public static void main(String[] args){
        A a=new A();
        System.out.println(a); //internally toString() is called by println()
                               //by default toString() returns FullyQualifiedName@Address
    }
}
