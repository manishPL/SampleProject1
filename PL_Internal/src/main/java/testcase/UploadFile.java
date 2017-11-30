package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static WebDriver driver=new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException, AWTException {
		driver.get("http://www.zamzar.com/");
		driver.findElement(By.xpath("//*[@id='inputFile']")).click();
		Thread.sleep(2000);
		StringSelection ss=new StringSelection("C:\\Users\\Office\\Desktop\\text.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot= new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
