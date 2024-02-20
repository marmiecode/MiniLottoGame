
import lombok.Data;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


@Data
public class LotteryGame implements Game {
    private Set<Integer> userNumbers;
    private final Set<Integer> lotteryNumbers;
    private final static int MAX_NUMBERS = 99;
    private final static int INPUT_NUMBERS = 6;

    public LotteryGame(Set<Integer> userNumbers) {
        this.userNumbers = userNumbers;
        this.lotteryNumbers = new HashSet<>();
    }

    private void roundLotteryNumbers() {
        Random random = new Random();
        while (lotteryNumbers.size() < INPUT_NUMBERS) {
            lotteryNumbers.add(random.nextInt(MAX_NUMBERS) + 1);
        }
    }
    private void checkResults() {
        Set<Integer> matchedNumbers = new HashSet<>(userNumbers);
        matchedNumbers.retainAll(lotteryNumbers);

        System.out.println("Wylosowane liczby to" + lotteryNumbers);
        System.out.println("Twoje liczby to: " + userNumbers);
        if (matchedNumbers.size() == INPUT_NUMBERS) {
            System.out.println("Brawo! To są te same liczby");
        } else {
            System.out.println("Niestety nie udało się. Trafiłeś " + matchedNumbers);
        }

    }


    @Override
    public void play() {
        roundLotteryNumbers();
        checkResults();
    }
}

