import java.util.Scanner;

/**
 * Title : ICA8 Testing
 * @author Kavya Alla
 */
public class urinals {
    public static void main(String[] args) {

        MainFunction implementation = new MainFunction();
        Integer i = implementation.countUrinals("10101");
        System.out.println("No:of Urinals available is " + i);

    }
}
