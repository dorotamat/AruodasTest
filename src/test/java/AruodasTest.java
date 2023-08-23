import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class AruodasTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test
    public void creatAdPositive() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("564");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("Sklypukas graziukas");
        driver.findElement(By.id("priceField")).sendKeys("60000");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.id("byPlanChooseOrder")).getText();
            System.out.println(txt);
        } catch (Exception e) {}
        Assert.assertEquals(txt, "");
    }
        @Test
        public void creatAdNoPhoneNumber() {
            driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
            driver.findElement(By.className("dropdown-input-value-title")).click();
            driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
            driver.findElement(By.id("districtTitle")).click();
            driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
            driver.findElement(By.id("quartalTitle")).click();
            driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
            driver.findElement(By.id("streetTitle")).click();
            driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
            driver.findElement(By.name("FHouseNum")).sendKeys("564");
            driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
            driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
            driver.findElement(By.name("notes_lt")).sendKeys("Sklypukas graziukas");
            driver.findElement(By.id("priceField")).sendKeys("60000");
            driver.findElement(By.name("phone")).sendKeys("66578901");
            driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
            driver.findElement(By.id("submitFormButton")).click();
            String txt = "";
            try {
                txt = driver.findElement(By.className("phone")).getText();
                System.out.println(txt);
            }catch (Exception e){}
            Assert.assertEquals(txt, "");
    }

    @Test
    public void creatAdNoEmail() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("564");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("Sklypukas graziukas");
        driver.findElement(By.id("priceField")).sendKeys("60000");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.className("email")).getText();
            System.out.println(txt);
        }catch (Exception e){}
        Assert.assertEquals(txt, "");
    }

    @Test
    public void creatAdWithoutPrice() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("564");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("Sklypukas graziukas");
        driver.findElement(By.id("priceField")).sendKeys("");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.className("error-arrow")).getText();
            System.out.println();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Neteisinga kaina");
    }

    @Test
    public void creatAdNoRegion() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
//        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("564");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("Sklypukas graziukas");
        driver.findElement(By.id("priceField")).sendKeys("60000");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.id("regionDropdown")).getText();
            System.out.println(txt);
        } catch (Exception e) {}
        Assert.assertEquals(txt, "");
    }

    @Test
    public void creatAdNoDescription() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("564");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("");
        driver.findElement(By.id("priceField")).sendKeys("60000");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.name("notes_lt")).getText();
            System.out.println(txt);
        } catch (Exception e) {}
        Assert.assertEquals(txt, "");
    }

    @Test
    public void creatAdNoArea() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.className("dropdown-input-value-title")).click();
        driver.findElement(By.id("regionDropdown")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("districtTitle")).click();
        driver.findElement(By.className("dropdown-input-values-address")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[2]/li[2]")).click();
        driver.findElement(By.id("quartalTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[2]/li[5]")).click();
        driver.findElement(By.id("streetTitle")).click();
        driver.findElement(By.className("dropdown-input-search-value")).findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[2]/li[85]")).click();
        driver.findElement(By.name("FHouseNum")).sendKeys("565");
        driver.findElement(By.name("RCNumber")).sendKeys("1234-1234-1234");
        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[4]/label/span")).click();
        driver.findElement(By.name("notes_lt")).sendKeys("sklypukas graziukas");
        driver.findElement(By.id("priceField")).sendKeys("60000");
        driver.findElement(By.name("phone")).sendKeys("66578901");
        driver.findElement(By.name("email")).sendKeys("grazusemailas@gmail.com");
        driver.findElement(By.id("submitFormButton")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.className("error-arrow")).getText();
            System.out.println(txt);
        } catch (Exception e) {}
        Assert.assertEquals(txt, "Įveskite bendrą plotą");
    }





    @BeforeClass
    public void before () {
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptCookies();
    }
    private void acceptCookies() {
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]")).click();
    }
}

