import java.util.Scanner;

/**
 * Title : ICA8 Testing
 * @author Kavya Alla
 */
public class urinals {
    public static void main(String[] args) {

        MainFunction obj=new MainFunction();
        Scanner scan=new Scanner(System.in);
        System.out.println("Press 1 for Keyboard input");
        System.out.println("Press 2 for file input");
        int choice=scan.nextInt();
        String s="";
        if(choice==1)
        {
            System.out.println("Enter your input");
            s=scan.next();
            int urinalCount=obj.countUrinals(s);
            if(urinalCount==-1)
                System.out.println("String is Invalid");
            else
                System.out.println(urinalCount);
        }
        else if(choice == 2)
        {
            obj.openFile("src/Urinal.dat");
        }
        else
        {
            System.out.println("Enter only 1 or 2");
        }

    }
}
