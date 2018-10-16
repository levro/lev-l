import onePackage.Addon;
import org.junit.Assert;
import org.junit.Test;

public class OneMtests {

    @Test
    public void testCombi(){
        Assert.assertEquals( "a-:-1", Addon.combi( "a", 1 ));
        Assert.assertEquals( "-:-0", Addon.combi( "", 0 ));
        Assert.assertEquals( "--:-1", Addon.combi( "-", 1 ));
        Assert.assertEquals( "|-:-1000", Addon.combi( "|", 1000 ));
    }
}
