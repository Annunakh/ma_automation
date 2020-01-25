import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("This is not expected number",14,this.getLocalNumber());
    }
}
