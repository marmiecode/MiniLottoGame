import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

@RequiredArgsConstructor
public class LotteryApp implements Game{
    private final LotteryGame lotteryGame;
    public Set<Integer> getUserInput() {
        Set<Integer> userNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 liczb od 1-99");
        while (userNumbers.size() < 6) {
            try {
                int number = scanner.nextInt();
                if (validateNumber(number)) {
                    userNumbers.add(number);
                } else {
                    System.err.println("Liczba spoza zakresu podaj jeszcze raz");
                    continue;
                }
                userNumbers.add(number);
            } catch (InputMismatchException e) {
                System.err.println("To muszą być liczby. Podaj jeszcze raz. ");
                scanner.next();
            }
        }
        return userNumbers;
}
public boolean validateNumber(int number) {

        return number >= 1 && number <= 99;
    }

    @Override
    public void play() {
        Set<Integer> userNumbers = getUserInput();
        lotteryGame.setUserNumbers(userNumbers);
        lotteryGame.play();
    }
}

