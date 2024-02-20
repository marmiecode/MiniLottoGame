import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor

public class LottoGameRound {
    private final Set<Integer> userNumbers;
    private final Set<Integer> lotteryNumbers;
}
