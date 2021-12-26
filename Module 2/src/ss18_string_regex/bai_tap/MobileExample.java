package ss18_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExample {
    private static final String ACCOUNT_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public MobileExample() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
