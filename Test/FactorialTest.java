import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void test(){
        Factorial fact = new Factorial();
        int result = fact.evaluate(6);
        assertEquals(720,result);
    }

}