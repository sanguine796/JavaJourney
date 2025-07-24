import java.util.*;
public class student
{
    String name;
    int roll;
    String branch;

    student(String name, int roll, String branch) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
    } 

    void display()
    {
        System.out.println(roll + " "+name+" (" +branch+")");
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>();
        while(true){
        System.out.println("\nChoose any one of them:\n1.Add Student\n2.View Data\n3.Exit");
        int ch=scan.nextInt();
        scan.nextLine(); 
        
        switch(ch)
        {
            case 1->{
                System.out.println("Enter Name:");
                String name=scan.nextLine();
                System.out.println("Enter Roll number:");
                int roll=scan.nextInt();
                scan.nextLine(); 
                System.out.println("Enter Branch:");
                String branch=scan.nextLine();
                list.add(new student(name,roll,branch));
            }
            case 2->{
                System.out.println("Students List: ");
                for(student s:list)
                    s.display();
            }

            case 3->{
                System.out.println("Exiting....");
                return;
            }
            default->System.out.println("Invalid Choice");
        }}
    }
}