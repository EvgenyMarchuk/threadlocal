import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class SecondTest extends TestBase{

    @Test
    public void GOOGLE21() {
        System.out.println("Google4 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Google");
        System.out.println("Google4 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE22() {
        System.out.println("Google4 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Google");
        System.out.println("Google4 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE23() {
        System.out.println("Google4 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google4 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Gooogle");
        System.out.println("Google4 Test Ended! " + Thread.currentThread().getId());
    }
}