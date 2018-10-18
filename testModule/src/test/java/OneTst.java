import onePackage.OneUtils;
import org.junit.Assert;
import org.junit.Test;

public class OneTst {

    @Test
    public void testVal(){
        Assert.assertEquals( 16, OneUtils.sAmount() );
    }
}
