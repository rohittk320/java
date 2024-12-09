public class NumberToWord {

    private static final String[] ONES = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = {
            "", "Thousand", "Million", "Billion"
    };

    public static void main(String[] args) {
        long number = 123456789L; // Example number
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(long number) {
        if (number == 0) {
            return "Zero";
        }

        String words = "";

        if (number < 0) {
            words = "Negative ";
            number = Math.abs(number);
        }

        int thousandCounter = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                words = convertHundreds((int) (number % 1000)) + THOUSANDS[thousandCounter] + " " + words;
            }
            number /= 1000;
            thousandCounter++;
        }

        return words.trim();
    }

    private static String convertHundreds(int number) {
        String words = "";

        if (number % 100 < 20) {
            words = ONES[number % 100];
            number /= 100;
        } else {
            words = ONES[number % 10];
            number /= 10;
            words = TENS[number % 10] + (words.isEmpty() ? "" : " ") + words;
            number /= 10;
        }

        if (number > 0) {
            words = ONES[number] + " Hundred " + words;
        }

        return words;
    }
}

