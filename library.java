class person
{
    private String name;
    private int age;

    public person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void ShowInfo(){
        System.out.println("The name of buyer is "+name+"and age is "+age);
    }
}

class member extends person
{
    private int memberId;

    public member(String name,int age,int memberId)
    {
        super(name,age);
        this.memberId=memberId;
    }
    public void ShowInfo(){
        System.out.println("The name of buyer is "+getName()+"and age is "+getAge()+"and the member id is"+memberId);
    }
}

class librarian extends person
{
    private int staffId;

    public librarian(String name,int age,int staffId)
    {
        super(name,age);
        this.staffId=staffId;
    }
    public void ShowInfo(){
        System.out.println("The name of buyer is "+getName()+"and age is "+getAge()+"and the staff id is"+staffId);
    }
}

public class library
{
    public static void main(String arg[])
    {
        person p1=new person("Sanguine",19);
        member m1=new member("Kruthika",12,23);
        librarian l1=new librarian("Sathwika",21,33);
        p1.ShowInfo();    
        m1.ShowInfo();        
        l1.ShowInfo();

        person[] people={p1,m1,l1};
        System.out.println("The system has all the people");
        for(person Person:people){
             Person.ShowInfo(); 
        }            
    }
}
