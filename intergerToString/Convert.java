public class Convert {

    public static final String[] placeValues = {"", " thousand ",  " million ", " billion ", " trillion ", " quadrillion ", "quintillion ", " hextillion ", " septillion ", " octillion ", "nonillion ", "decillion ", " undecillion ", "duodecillion ", " tredecillion ", " quattuordecillion ", " quindecillion ", " hexdecillion ", " septendecillion ", " octodecillion ", " novemdecillion ", " vigintillion ", "unvigintilion ", " duovigintillion ", " trevigintillion ", " quattourvigintillion ", " quinvigintillion ", " hexvigintillion ", " septenvigintillion ", " octovigintillion ", " novemvigintillion ", " trigintillion ", " untrigintillion ", " duotrigintillion"};
    public static void main(String[] args) {
        long num;
        try {
            num = Long.parseLong(args[0]);
            // num = Integer.parseInt(args[0]);
            if (num == 0) {
                System.out.println("zero");
            }
            else {
                System.out.println(intToString(num));
            }
        }
        catch (Exception ex) {
            // ex.printStackTrace();
            if (args[0].length() >= 10) {
                System.out.println("The number entered: " + args[0] + " is either too large or not a valid number.\nProper Format: make string ARGS=\"NUMBER\"");
            }
            else { 
                System.out.println("An invalid number was entered: " + args[0] + ".\nProper Format: make string ARGS=\"NUMBER\"");
            }
        }
    }

    public static String intToString(long num) {
        String numStr = Long.toString(num);
        String finalString = "";
        String[] numbers;
        for (int i = numStr.length()-1-3; i >= 0; i -= 3) {
            numStr = numStr.substring(0, i+1) + ":" + numStr.substring(i+1);
        }
        numbers = numStr.split(":");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = hundreds(Integer.parseInt(numbers[i]));
            if (numbers[i].length() > 0 && (numbers[i].charAt(numbers[i].length()-1) == '-' || numbers[i].charAt(numbers[i].length()-1) == ' ')) {
                numbers[i] = numbers[i].substring(0, numbers[i].length()-1);
            }
        }

        for (int i = numbers.length -1; i >= 0; i--) {
            int n = numbers.length - 1 - i;
            finalString = numbers[i] + placeValues[n] + finalString;
        }
        return finalString;
    }

    public static String hundreds(int num) {
        if (num == 0) {
            return "";
        }
        else if (num >= 100) {
            return hundreds(num/100) + " hundred " + hundreds(num%100);
        }
        else if (num == 1) {
            return "one";
        }
        else if (num == 2) {
            return "two";
        }
        else if (num == 3) {
            return "three";
        }
        else if (num == 4) {
            return "four";
        }
        else if (num == 5) {
            return "five";
        }
        else if (num == 6) {
            return "six";
        }
        else if (num == 7) {
            return "seven";
        }
        else if (num == 8) {
            return "eight";
        }
        else if (num == 9) {
            return "nine";
        }
        else if (num == 10) {
            return "ten";
        }
        else if (num == 11) {
            return "eleven";
        }
        else if (num == 12) {
            return "twelve";
        }
        else if (num == 13) {
            return "thirteen";
        }
        else if (num == 14) {
            return "fourteen";
        }
        else if (num == 15) {
            return "fifteen";
        }
        else if (num == 16) {
            return "sixteen";
        }
        else if (num == 17) {
            return "seventeen";
        }
        else if (num == 18) {
            return "eighteen";
        }
        else if (num == 19) {
            return "nineteen";
        }
        else if (num >= 90) {
            return "ninety-" + hundreds(num%10);
        }
        else if (num >= 80) {
            return "eighty-" + hundreds(num%10);
        }
        else if (num >= 70) {
            return "seventy-" + hundreds(num%10);
        }
        else if (num >= 60) {
            return "sixty-" + hundreds(num%10);
        }
        else if (num >= 50) {
            return "fifty-" + hundreds(num%10);
        }
        else if (num >= 40) {
            return "forty-" + hundreds(num%10);
        }
        else if (num >= 30) {
            return "thirty-" + hundreds(num%10);
        }
        else if (num >= 20) {
            return "twenty-" + hundreds(num%10);
        }
        return null;
    }
    
}