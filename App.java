import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","E:\\ST MODEL LAB\\FaceBook Test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();

        WebElement fname = driver.findElement(By.name("firstname"));
        WebElement lname = driver.findElement(By.name("lastname"));
        WebElement email = driver.findElement(By.name("reg_email__"));
        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        WebElement day  = driver.findElement(By.name("birthday_day"));
        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement year = driver.findElement(By.name("birthday_year"));
        WebElement rbtn = driver.findElement(By.xpath("//input[@value=2]"));
        WebElement link = driver.findElement(By.partialLinkText("Already have"));


        String a = driver.getTitle();
        WebElement para = driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div[1]/div[2]"));
        WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
        fname.sendKeys("SoftWare");
        Thread.sleep(2000);
        lname.sendKeys("Testing");
        Thread.sleep(2000);
        email.sendKeys("stmodel@gmail.com");
        Thread.sleep(2000);
        pass.sendKeys("malagok");
        Thread.sleep(2000);
        day.sendKeys("7");
        Thread.sleep(2000);

        Select option = new Select(month);
        option.selectByVisibleText("Aug");
        Thread.sleep(2000);

        year.sendKeys("2004");
        Thread.sleep(2000);

        if(!rbtn.isSelected()){

            rbtn.click();
        }
        btn.click();
        Thread.sleep(2000);

        System.out.println(a);
        System.out.println(para.getText());

        link.click();
        Thread.sleep(2000);
        driver.navigate().back();



        


    }
}