package tests;

import onePackage.OneUtils;
import org.junit.Assert;
import org.junit.Test;
import java.util.logging.Logger;

public class OneTests {

    Logger logger = Logger.getLogger( String.valueOf( OneTests.class ) );

    @Test
    public void testCombi(){
        logger.info( "TEST COMBI METHOD" );
        Assert.assertEquals( "a-:-1", OneUtils.combi( "a", 1 ));
        Assert.assertEquals( "-:-0", OneUtils.combi( "", 0 ));
        Assert.assertEquals( "--:-1", OneUtils.combi( "-", 1 ));
        Assert.assertEquals( "|-:-1000", OneUtils.combi( "|", 1000 ));
    }

    @Test
    public void testMulti(){
        logger.info( "TEST MULTI METHOD" );
        Assert.assertEquals( "a", OneUtils.multi( "a", 1 ));
        Assert.assertEquals( "", OneUtils.multi( "", 5 ));
        Assert.assertEquals( "||||||||", OneUtils.multi( "|", 8 ));
        Assert.assertEquals( "16 x ()", OneUtils.multi( "()", 16 ));
    }

    @Test
    public void testCat(){
        logger.info( "TEST CAT METHOD" );
        Assert.assertEquals( "Barss", OneUtils.cat() );
    }

    @Test
    public void testTen(){
        logger.info( "TEST TEN METHOD" );
        Assert.assertEquals( 10, OneUtils.ten() );
    }

    @Test
    public void testSCount(){
        logger.info( "TEST SCOUNT METHOD" );
        Assert.assertEquals( 16, OneUtils.sCount( "hygt", 4 ) );
    }
}
