import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

        public static void main(String[] args) {
//
//        String text = "FIFA will never regret it";
//        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
//        for (String word : words) {
//            System.out.println(word);
//        }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your phone number");
            String input = scanner.nextLine();

            boolean result = input.matches("\\+*([3][8][0])\\d{9}");
            if (result) {
                System.out.println(input.concat(" -Is phone number."));
            } else {
                System.err.println(input.concat(" -It is not a phone number!!"));
            }
            System.out.println("Please check your email");
            String email = scanner.nextLine();
            boolean result2 = input.matches("^[A-Z0-9._%+-}]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
            if (result) {
                System.out.println(email.concat(" - Email is valid"));
            }
            else {
                System.err.println(email.concat(" - Invalid email"));
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Введшть слово");
            String input2 = scanner.nextLine();
            boolean result3 = Pattern.matches("hello", input2);
            if (result3) {
                System.out.println("Знайдено");
            }
            else {
                System.out.println("Не знайдено!");
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            String in2 = "Hello Java! Hello JavaScript! JavaSE 8.";
            Pattern pattern = Pattern.compile("Java(\\w*)");
            Matcher matcher = pattern.matcher(in2);
            while(matcher.find())
                System.out.println(matcher.group());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            String in3 = "Hello Java! Hello JavaScript! JavaSE 8.";
            Pattern pattern2 = Pattern.compile("Java(\\w*)");
            Matcher matcher2 = pattern2.matcher(in3);
            String newStr = matcher2.replaceAll("Liv");
            System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        }
    }


