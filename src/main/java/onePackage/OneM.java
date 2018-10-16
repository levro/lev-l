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

        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add( Addon.multi( "a", 1 ) );
        lst1.add( Addon.multi( "", 2 ) );
        lst1.add( Addon.multi( "|", 6 ) );
        lst1.add( Addon.multi( "()", 4 ) );
        lst1.add( Addon.multi( "a", 0 ) );
        lst1.add( Addon.cat() );
        lst1.add( String.valueOf( Addon.ten() ) );

        System.out.println( lst1);
    }
}
