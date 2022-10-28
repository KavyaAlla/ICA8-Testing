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


}

