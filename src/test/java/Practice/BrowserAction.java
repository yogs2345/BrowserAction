package Practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BrowserAction {

	public static void main(String[] args) {
		//1. TODO Auto-generated method stub
		// launch the browser
		WebDriver driver=new ChromeDriver();
		//2.minimize the browser window
		  driver.manage().window().minimize();
		  //3. Maximize to specific resolution (800,400)
		  driver.manage().window().setSize(new Dimension(800,400));
	//	  try {
	//		Thread.sleep(5000);
	//	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		  //4. maximise the window
		driver.manage().window().maximize();
		// 5.delete All cookies
		driver.manage().deleteAllCookies();
		//6.open the url in the browser
		driver.get("https://www.google.com/");
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//7. verify the application title
		String ActualTitle= driver.getTitle();
		Assert.assertEquals(ActualTitle, "Google");
		//8. Navigate to the different application
		driver.navigate().to("https://www.selenium.dev/");
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//9. Go back to the previous application
		driver.navigate().back();
		//10.Move forward to the next application
		driver.navigate().forward();
		//11.refresh the application
		driver.navigate().refresh();
		//12. collect the main Window ID(window handle id)
		String mainWindowId=driver.getWindowHandle();
		System.out.println(mainWindowId);
		// 13.Launch new window and launch the application in new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//14. Switch back to the main window
		driver.switchTo().window(mainWindowId);
		// open the new tab in window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		// 15. print browser window url
		   String url= driver.getCurrentUrl();
		   System.out.println(url);
		   //16 Get the size of window
		   int height=driver.manage().window().getSize().getHeight();
		   int width=driver.manage().window().getSize().getWidth();
		   System.out.println(height+"X"+width);
		   
		   // 17. close current window
		     driver.close();
		     
		     // 18. close all the window
		     driver.quit();
		   
		
		
		
		

	}

}
