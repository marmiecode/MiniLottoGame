import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@RequiredArgsConstructor
public class LotteryApp {
    public Set<Integer> getUserInput() {
        Set<Integer> userNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 6 liczb od 1-99");
        while (userNumbers.size() < 6) {
            int number = scanner.nextInt();
            if (validateNumber(number)) {
                userNumbers.add(number);
            } else {
            System.out.println("Liczba spoza zakresu podaj jeszcze raz");
        }
    }
        return userNumbers;
}
public boolean validateNumber(int number) {
    return number >= 1 && number <= 99;
    }
}

