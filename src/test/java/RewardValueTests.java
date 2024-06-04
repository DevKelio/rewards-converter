import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "O valor em dinheiro deve corresponder");
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "O valor em milhas deve corresponder");
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMiles = 2000;
        double actualMiles = rewardValue.convertToMiles();
        assertEquals(expectedMiles, actualMiles, "A conversão de cash para milhas deve ser precisa");
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCash = 500;
        double actualCash = rewardValue.convertToCash();
        assertEquals(expectedCash, actualCash, "A conversão de milhas para cash deve ser precisa");
    }
}
