package school.mjc.stage0.conditions.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(Character.toString(symbol));

        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
