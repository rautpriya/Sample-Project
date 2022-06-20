package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
public void captureScreen(WebDriver driver,String name) throws IOException {
		
        TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File source=tsc.getScreenshotAs(OutputType.FILE);
	    //store location
	
		File file=new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
	    FileHandler.copy(source, file);
	    System.out.println("Screenshot captured");
	}

}
