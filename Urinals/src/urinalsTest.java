import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class urinalsTest {

        @Test
        void testForIncorrectInput() {
                MainFunction implement = new MainFunction();
                boolean i = implement.goodString("Kavya Alla");
                System.out.println("====== KAVYA ALLA == TEST ONE EXECUTED =======");
                Assertions.assertEquals(false,i);

        }
        @Test
        void testCountUrinals() {
               MainFunction mainFunction = new MainFunction();
                Integer i = mainFunction.countUrinals("10100");
                System.out.println("====== KAVYA ALLA == TEST TWO EXECUTED =======");
                Assertions.assertEquals(1,i);
        }

    @Test
    public void testOpenFile(){
        MainFunction test = new MainFunction();
        Assertions.assertEquals(1,test.openFile("src/urinal.dat"));
        System.out.println("===== KAVYA ALLA== TEST THREE EXECUTED=======");
    }

    @Test
    public void testWriteToFile() {
        String optFile = "src/rule.txt";
        MainFunction test = new MainFunction();
        Assertions.assertEquals(1, test.writeFile(optFile, 3));
        System.out.println("===== KAVYA ALLA== TEST FOUR EXECUTED=======");
    }

}

