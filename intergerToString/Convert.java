public class Convert {
    public static void main(String[] args) {
        int num;
        try {
            num = Integer.parseInt(args[0]);
        }
        catch (Exception ex) {
            // ex.printStackTrace();
            System.out.println("An invalid number was entered.\nProper Format: make string ARGS=\"NUMBER\"");
        }
    }

    public static String intToString(int num) {
        return "";
    }

    public static String hundreds(int num) {
        return "";
    }
    
}