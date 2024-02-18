import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LotteryAppTest {
    @Test
    void testValidateNumber() {
        LotteryApp lotteryApp = new LotteryApp();
        assertTrue(lotteryApp.validateNumber(50));
    }

    @Test
    void testNumberOfRange(){
        LotteryApp lotteryApp = new LotteryApp();
        assertFalse(lotteryApp.validateNumber(100));
    }

    @Test
    void testNegativeNumber() {
        LotteryApp lotteryApp = new LotteryApp();
        assertFalse(lotteryApp.validateNumber(-5));
    }

    @Test
    void testGetUserInput(){
        LotteryApp lotteryApp = new LotteryApp();
        Set<Integer> userNumber = lotteryApp.getUserInput();
        assertEquals(6, userNumber.size());

        for (int number:userNumber) {
            assertTrue(lotteryApp.validateNumber(number));
        }
    }

}