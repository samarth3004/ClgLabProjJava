import java.util.Scanner;



public class student{
    Scanner sc = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    public int roll, age , marks;
    public String name , address;
    public void getData(){
         System.out.println("enter roll number:");
         roll = sc.nextInt();
         System.out.println("enter your age:");
         age = sc.nextInt();
         System.out.println("enter your marks:");
         marks = sc.nextInt();
         System.out.println("enter your name:");
         name =  s.nextLine();
         System.out.println("enter your address:");
         address = s.nextLine();

        
    

    }
    public void display(){
        System.out.println(roll);
        System.out.println(age);
        System.out.println(marks);
        System.out.println(name);
        System.out.println(address);
        
    }
public static void main(String[] args) {
    student S = new student();
    S.getData();
    S.display();
    
}

}
