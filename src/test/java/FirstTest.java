import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class FirstTest extends TestBase {

    @Test
    public void GOOGLE11() {
        System.out.println("Google1 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Gooogle");
        System.out.println("Google1 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE12() {
        System.out.println("Google2 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + Thread.currentThread().getId());
    }

    @Test
    public void GOOGLE13() {
        System.out.println("Google3 Test Started! " + Thread.currentThread().getId());
        getThlDriver().navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + getThlDriver().getTitle() +" "+ Thread.currentThread().getId());
        Assert.assertEquals(getThlDriver().getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + Thread.currentThread().getId());
    }
}