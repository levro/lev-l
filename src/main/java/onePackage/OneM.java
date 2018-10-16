package onePackage;

import java.util.ArrayList;

public class OneM {
    public static void main( String[] args ) {

        ArrayList<String> lst = new ArrayList<>();
        lst.add( Addon.combi("Block", 18));
        lst.add( "243-456-772" );
        lst.add( Addon.varCat );
        lst.add( String.valueOf( Addon.amount ));

        System.out.println( lst);

    }
}
