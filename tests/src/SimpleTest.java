import jetbrains.buildServer.BaseTestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 *         Date: 16.11.11 17:14
 */
public class SimpleTest extends BaseTestCase {
  @Test
  public void Test() {
    AppService appService = new AppService();
    String name = appService.GetName();

    Assert.assertEquals(name, "Bob");
  }
}
