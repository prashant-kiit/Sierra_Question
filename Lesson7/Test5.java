package Lesson7;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    private Map<String, Integer> accountTotals = new HashMap<String, Integer>();

    public int getBalance(String accountName) {
        Integer total = accountTotals.get(accountName);
        if (total == null)
            total = 0;
        return total;
    }

    public void setBalance(String accountName, int amount) {
        accountTotals.put(accountName, amount);
    }
}