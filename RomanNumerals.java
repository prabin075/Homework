import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanValues.get(currentSymbol);

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String roman1 = "III";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";

        System.out.println(roman1 + " = " + romanToInt(roman1));
        System.out.println(roman2 + " = " + romanToInt(roman2));
        System.out.println(roman3 + " = " + romanToInt(roman3));
    }
}
