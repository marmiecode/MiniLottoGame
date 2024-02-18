import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;
import java.util.Set;

@Data
@AllArgsConstructor
public class LotteryGame implements Game {
    private final Set<Integer> userNumbers;
    private final Set<Integer> lotteryNumbers;
    private final static int MAX_NUMBERS = 99;
    private final static int INPUT_NUMBERS = 6;

    private void drawLotteryNumbers() {
        Random random = new Random();
        while (lotteryNumbers.size() < INPUT_NUMBERS) {
            lotteryNumbers.add(random.nextInt(MAX_NUMBERS) + 1);
        }
    }

    @Override
    public void play() {

    }
}

