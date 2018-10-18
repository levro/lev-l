package onePackage;

public class OneUtils {
    public static String varCat = "Barss";
    public static int amount = 2;

    public static String cat(){
        return varCat;
    }

    public static String combi( String str, int val ){
        return str + "-:-" + val;
    }

    public static String multi (String str, int val ){
        if (val < 10 ) {
            String res = "";
            for ( int i = 0; i < val; i++ ) {
                res += str;
            }
            return res;
        }
        return String.valueOf( val ) + " x " + str;
    }

    public static int ten(){
        return 10;
    }

    public static int sAmount() { return amount; }

    public static int sCount( String str, int val ){
        return str.length() * val;
    }

}
