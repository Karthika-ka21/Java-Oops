package oops.ObjectClass;
class Rectangle {
    int length;
    int breadth;
    Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }

    @Override
    public String toString() {
        return "Rectangle[length:"+length+" breadth:"+breadth+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle){
            Rectangle r=(Rectangle)obj;
            return (this.length==r.length&&this.breadth==r.breadth);
        }
        else return false;
    }
    
}
class Test2{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3,4);
        Rectangle r2=new Rectangle(5,10);
        Rectangle r3=new Rectangle(3,4);
        System.out.println(r1);
        System.out.println(r1==r2);
        System.out.println(r1==r3);
        System.out.println(r1.equals(r2));
         System.out.println(r1.equals(r3));
         Circle c=new Circle(5);
          System.out.println(r1.equals(c));
        
        
    }
}
