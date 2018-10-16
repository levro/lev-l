package tests;

import onePackage.Addon;
import org.junit.Assert;
import org.junit.Test;
import java.util.logging.Logger;

public class OneMtests {

    Logger logger = Logger.getLogger( String.valueOf( OneMtests.class ) );

    @Test
    public void testCombi(){
        logger.info( "LOG MESSAGE #1" );
        Assert.assertEquals( "a-:-1", Addon.combi( "a", 1 ));
        Assert.assertEquals( "-:-0", Addon.combi( "", 0 ));
        Assert.assertEquals( "--:-1", Addon.combi( "-", 1 ));
        Assert.assertEquals( "|-:-1000", Addon.combi( "|", 1000 ));

        logger.info( "LOG MESSAGE #2" );
        Assert.assertEquals( "Barss", Addon.cat() );
        Assert.assertEquals( "a", Addon.multi( "a", 1 ));
        Assert.assertEquals( "", Addon.multi( "", 5 ));
        Assert.assertEquals( "||||||||", Addon.multi( "|", 8 ));
        Assert.assertEquals( "16 x ()", Addon.multi( "()", 16 ));
    }
}
