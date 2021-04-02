package Helpers;

import java.util.Random;

 public class RandomCarNumber {
    public String main() {

        // create a string of uppercase and lowercase characters and numbers
        String upperAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet;

        String alphaNumeric2 = numbers;

        String alphaNumeric3 = upperAlphabet;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 2;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);


            // append the character to string builder
            sb.append(randomChar);
        }
        int length2 = 4;

        for(int i = 0; i < length2; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric2.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric2.charAt(index);


            // append the character to string builder
            sb.append(randomChar);
        }
        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric3.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric3.charAt(index);


            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();
    }
}