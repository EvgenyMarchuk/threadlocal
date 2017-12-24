import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

    protected static ThreadLocal<WebDriver> thlDriver = new ThreadLocal<WebDriver>();

    public static void setThlDriver(WebDriver driver) {
        thlDriver.set(driver);
    }

    public static WebDriver getThlDriver(){
        return thlDriver.get();
    }

    @BeforeClass
    public void setupTest (){
        //Set Browser to ThreadLocalMap
        setThlDriver(new ChromeDriver());
        getThlDriver().manage().window().maximize();
    }



    @AfterClass
    public void tearDown() {
        getThlDriver().quit();

    }

    @AfterSuite
    public void tearDownTest(){
        thlDriver.remove();
    }
}