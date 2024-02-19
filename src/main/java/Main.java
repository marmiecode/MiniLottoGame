import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        LotteryGame lotteryGame = new LotteryGame(new HashSet<>());
        LotteryApp lotteryApp = new LotteryApp(lotteryGame);
        lotteryApp.play();
    }
}
