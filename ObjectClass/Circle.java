package oops.ObjectClass;

class Circle{
    int radius;
    Circle(int r)
    {
        radius=r;
    }

    @Override
    public String toString() {
       return "Circle[radius:"+radius+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle)
        {
            Circle c=(Circle)obj;
            return this.radius==c.radius;
        }
        else 
            return false;
    }
}
class Test1{
    public static void main(String[] args) {
        Circle c1=new Circle(5);
        Circle c2=new Circle(5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(c1==c2); //always compares address of 2 objects
        A a=new A();
        System.out.println(c1.equals(c2)); //by default compares the address of 2 objects
                                           //we can override to compare the values of 2 objects
        System.out.println(c1.equals(a));
    }                                      
}