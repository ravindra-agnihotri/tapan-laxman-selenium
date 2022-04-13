import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestClass {

    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","C:/downloads/chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       //implicit wait
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_pim_viewPimModule\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_leave_viewLeaveModule\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_time_viewTimeModule\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_recruitment_viewRecruitmentModule\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_pim_viewMyDetails\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu__Performance\"]")).click();
        driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
        driver.findElement(By.xpath("//span[@class=\"quickLinkText\"]")).click();
        driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Tapan Bojja");
        driver.findElement(By.xpath("//textarea[@id ='assignleave_txtComment']")).sendKeys("This is the comment added by Tapan");
        //escape character

        // code to select value from 'Leave Type' drop down
        WebElement element = driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']"));
        Select select = new Select(element);
        select.selectByVisibleText("CAN - Vacation");

      /*  Select select1= new Select(driver.findElement(By.xpath("xpath for dropdown")));
        select1.*/



        driver.findElement(By.xpath("//input[@id='assignBtn']")).click();


        driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_maintenance_purgeEmployee\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_buzz_viewBuzz\"]")).click();
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")))
                .moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")))
                .click(driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"))).build().perform();


    }


}
/*
variable types
explicit wait
calandar
xpath relation

frames
 */