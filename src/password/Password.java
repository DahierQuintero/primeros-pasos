package password;

import java.util.Arrays;
import java.util.Locale;

public class Password {

    private int length;
    private String password;

    public Password () {
        this.length = 8;
        this.password = generatePassword(length);
    }

    public Password (int length) {
        this.length = length;
        this.password = generatePassword(length);
    }

    public String generatePassword(int length) {

        String result = "";

        for (int i = 0; i < length; i++) {
            int selected = (int) (Math.random() * 4) + 1;
            if (selected == 1) {
                result += (char) ((Math.random() * 26) + 97);
            } else if (selected == 2) {
                result += (char) ((Math.random() * 26) + 65);
            }
            else if (selected == 3) {
                result += (char) ((Math.random() * 14) + 33);
            }
            else {
                result += (char) ((Math.random() * 10) + 48);
            }
        }
        System.out.println(result);
        return "";
    }
}
