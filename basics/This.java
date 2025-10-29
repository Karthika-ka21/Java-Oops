class This
{
    int i;
    void m1(){
        System.out.println("in m1");
        int i=1;
        System.out.println(i);
        System.out.println(this.i);
    }
}

class Test2{
    public static void main(String[] args) {
        This t=new This();
        t.i=10;
        t.m1();
    }
}
