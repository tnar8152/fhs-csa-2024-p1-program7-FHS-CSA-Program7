package src.test.java;
import src.main.java.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestProgram7. Dont edit or it will mess up your grade :)
 *
 * @author Mr. Johnson
 * @version 8/21/24 v1 (a version number or a date)
 */
public class TestProgram7{
    private Program7 tester = new Program7();

    @Test
    public void sanityTest(){
        assertEquals(0.0, tester.convertMoney(0,0,0));
        assertEquals(1.0, tester.convertMoney(1,0,0));
        assertEquals(1.1, tester.convertMoney(1,0,1));
    }

}
