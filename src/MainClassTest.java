import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {
        Assert.assertTrue("The string does not contain 'hello' or 'Hello'",
                this.getClassString().contains("Hello") ||
                        this.getClassString().contains("hello"));
    }
}
