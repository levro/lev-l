package onePackage;

public class Addon {
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


}
