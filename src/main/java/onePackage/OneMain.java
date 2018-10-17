package onePackage;

import java.util.ArrayList;

public class OneMain {
    public static void main( String[] args ) {

        ArrayList<String> lst = new ArrayList<>();
        lst.add( OneUtils.combi( "Block", 18));
        lst.add( "243-456-772" );
        lst.add( OneUtils.varCat );
        lst.add( String.valueOf( OneUtils.amount ));

        System.out.println( lst);

        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add( OneUtils.multi( "a", 1 ) );
        lst1.add( OneUtils.multi( "", 2 ) );
        lst1.add( OneUtils.multi( "|", 6 ) );
        lst1.add( OneUtils.multi( "()", 4 ) );
        lst1.add( OneUtils.multi( "a", 0 ) );
        lst1.add( OneUtils.cat() );
        lst1.add( String.valueOf( OneUtils.ten() ) );

        System.out.println( lst1);
    }
}
