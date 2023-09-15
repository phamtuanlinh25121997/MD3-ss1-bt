import java.util.Scanner;

public class UngDungChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên không âm (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = convertToWords(number);
            System.out.println(number + " được đọc là: " + result);
        }
    }
    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        } else if (number < 10) {
            switch (number) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                default:
                    return "Invalid input";
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "Invalid input";
            }
        } else if (number < 100) {
            int tenDigit = number / 10;
            int oneDigit = number % 10;
            String tenWord = "";
            String oneWord = "";
            switch (tenDigit) {
                case 2:
                    tenWord = "twenty";
                    break;
                case 3:
                    tenWord = "thirty";
                    break;
                case 4:
                    tenWord = "forty";
                    break;
                case 5:
                    tenWord = "fifty";
                    break;
                case 6:
                    tenWord = "sixty";
                    break;
                case 7:
                    tenWord = "seventy";
                    break;
                case 8:
                    tenWord = "eighty";
                    break;
                case 9:
                    tenWord = "ninety";
                    break;
                default:
                    return "Invalid input";
            }
            if (oneDigit > 0) {
                oneWord = convertToWords(oneDigit);
            }
            return tenWord + (oneDigit > 0 ? " " + oneWord : "");
        } else {
            int hundredDigit = number / 100;
            int remainingDigits = number % 100;
            String remainingWords = convertToWords(remainingDigits);
            String hundredWord = convertToWords(hundredDigit);
            return hundredWord + " hundred" + (remainingDigits > 0 ? " and " + remainingWords : "");
        }
    }
}
