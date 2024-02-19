import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


class LotteryAppTest {
    @Test
    void testValidateNumber() {
        LotteryGame lotteryGameMock = mock(LotteryGame.class);
        LotteryApp lotteryApp = new LotteryApp(lotteryGameMock);
        assertTrue(lotteryApp.validateNumber(50));
    }

    @Test
    void testNumberOfRange(){
        LotteryGame lotteryGameMock = mock(LotteryGame.class);
        LotteryApp lotteryApp = new LotteryApp(lotteryGameMock);
        assertFalse(lotteryApp.validateNumber(100));
    }

    @Test
    void testNegativeNumber() {
        LotteryGame lotteryGameMock = mock(LotteryGame.class);
        LotteryApp lotteryApp = new LotteryApp(lotteryGameMock);
        assertFalse(lotteryApp.validateNumber(-5));
    }


}