import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:/downloads/chrome");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
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
        driver.findElement(By.xpath("//a[@id=\"menu_dashboard_index\"]")).click();
            driver.findElement(By.xpath("//span[@class=\"quickLinkText\"]")).click();
            System.out.println("Hellooooooooooooooooooooo");
            driver.notify();



        driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_maintenance_purgeEmployee\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_buzz_viewBuzz\"]")).click();



    }



}
