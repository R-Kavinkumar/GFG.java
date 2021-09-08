public class Student
{
    String name;
    int age;
    String address;
    public Student()
    {
        this.name="unknown";
        this.age=0;
        this.address="not avaliable";
    }
    public void setinfo(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
    public void setinfo(int age ,String name,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public String toString()
    {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    public static void main(String[] args)
    {
        Student stu1 =new Student();
        Student stu2 =new Student();
        Student stu3 =new Student();
        Student stu4 =new Student();
        Student stu5 =new Student();
        Student stu6 =new Student();
        Student stu7 =new Student();
        Student stu8 =new Student();
        Student stu9 =new Student();
        Student stu10 =new Student();
        stu1.setinfo(21,"kavin");
        System.out.println(stu1);
        System.out.println(stu2);
        stu3.setinfo(19,"kamelash","thiruchagode");
        System.out.println(stu3);
        stu4.setinfo(31,"nishanth","chenni");
        System.out.println(stu4);
        System.out.println(stu5);
        stu6.setinfo(21,"kavin");
        System.out.println(stu6);
        stu7.setinfo(2,"praveen");
        System.out.println(stu7);
        stu8.setinfo(21,"kavin");
        System.out.println(stu8);
        stu9.setinfo(21,"kavin");
        System.out.println(stu9);
        stu10.setinfo(21,"kavin");
        System.out.println(stu10);
    }
}


