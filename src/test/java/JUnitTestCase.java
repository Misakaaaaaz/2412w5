import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitTestCase {

//    @Test
//    void test() {
//        fail("Not yet implemented");
//    }
    //remove this default test method and include the one below
    //the above is how to fail a test. remove the code to have your tests passing

    //include this below test case
    @Test
    void testAdd() {
        JUnitDemo test = new JUnitDemo();
        int output = test.add(1, 2);
        //test.add where add is the method created in the JUnitDemo class
        assertEquals(3, output);
    }
}
