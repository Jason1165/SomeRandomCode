public class Convert {
    public static void main(String[] args) {
        int num;
        try {
            num = Integer.parseInt(args[0]);
            if (num == 0) {
                System.out.println("zero");
            }
            else {
                String str = hundreds(num);
                if (str.charAt(str.length()-1) == '-') {
                    str = str.substring(0, str.length()-1);
                }
                System.out.println(str);
            }
        }
        catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println(args[0]);
            System.out.println("An invalid number was entered.\nProper Format: make string ARGS=\"NUMBER\"");
        }
    }

    public static String intToString(int num) {
        return "";
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