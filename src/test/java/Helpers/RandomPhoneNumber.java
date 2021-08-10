package Helpers;
import java.util.Random;

public class RandomPhoneNumber {
    public String main2() {

        // create a string of uppercase and lowercase characters and numbers

        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric =  numbers;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return "96" + randomString;
    }
}