import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LaxmanTest {

    public static WebDriver driver;//daru nai pita aisa driver de           =========//null
    public static void main(String[] args) {
        login();


}


    public static void login(){//gadi chalu ho rahi hai company k liye
        // System.setProperty("webdriver.chrome.driver","C:/downloads/chrome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();//na daru pine wala driver mangaya         ==============//chromedriver chi capability
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        List<WebElement> menu=driver.findElements(By.xpath(" //li[@class=\"main-menu-first-level-list-item\"]//child::a[@class=\"firstLevelMenu\"]//b"));
        // kuth paun ; kuth paryant ; kasa
      /*  for (int i =0;i<=menu.size()-1; i++){
            if (menu.get(i).getText().equals("Time")){
                menu.get(i).click();
                        break;

                        //Test
            }*/


        for (WebElement element  : menu   ) {
            if (element.getText().equals("Time")){
                element.click();
                break;
            }
        }

    }//ul[@id="mainMenuFirstLevelUnorderedList"]//a[@class="firstLevelMenu"]//b
    //li[@class="main-menu-first-level-list-item"]//child::a[@class="firstLevelMenu"]//b

    public static void restOps(){


        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();

        WebDriverWait webDriverWait= new WebDriverWait(driver, 60);
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']"))));
        driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
        driver.findElement(By.xpath("//a[@id='menu__Performance']")).click();
        driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).click();
        driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();
        driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empName']")).sendKeys("Tapan Bojja");
        driver.findElement(By.xpath("//textarea[@id ='assignleave_txtComment']")).sendKeys("This is the comment added by Tapan");
        //escape character

        // code to select value from 'Leave Type' drop down
        WebElement element = driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']"));

        Select select = new Select(element);
        select.selectByVisibleText("CAN - Vacation");

       /* Select select1= new Select(driver.findElement(By.xpath("xpath for dropdown")));
        select1.
*/


        driver.findElement(By.xpath("//input[@id='assignBtn']")).click();


        driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_maintenance_purgeEmployee\"]")).click();
        driver.findElement(By.xpath("//a[@id=\"menu_buzz_viewBuzz\"]")).click();
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")))
                .moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")))
                .click(driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"))).build().perform();




        //Second level = //li[@class='current main-menu-first-level-list-item']//child::a[@class='arrow']
        // Thrid level = //li[@class='current main-menu-first-level-list-item']//ul/li[1]/ul[1]/li/a


        //*[@id="menu_time_viewMyTimesheet"]
        /html/body/div[1]/div[2]/ul/li[4]/ul/li[1]/ul/li[1]/a

    }


/*
local variable= it has limit only inside { and } brackets
Global variable= a variable defined inside class as public and static type is called as global var.
Instance variable= it is a variable which is called by class object and has value limited till that object
 */

/*
public  int j=0;
    public void a(){
        System.out.println(j);
    }
    public void b(){
        System.out.println(j);
    }

    public static void main(String[] args) {
        TestClass testClass= new TestClass();
        System.out.println(testClass);
        testClass.j=1;
        System.out.println(testClass.j);
        TestClass testClass1=new TestClass();
        System.out.println(testClass1);
    }
*/

}
/*
variable types -- done
explicit wait -- done
calendar
xpath relation
select - done
action - done
for, foreach

frames
 */