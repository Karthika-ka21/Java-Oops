 class Student {
    String name;
    long pNum;
    int regNum;
    static int count=100;
    Student(String name,long pnum){
        this.name=name;
        this.pNum=pnum;
        regNum=++count;

    }
    void display(){
        System.out.println(name+" "+" "+pNum+" "+regNum);
    }
}

class Test3{
    public static void main(String[] args)
    {
        Student s1=new Student("Ria",1234);
        Student s2=new Student("Raj",2345);
        s1.display();
        s2.display();
    }
}
