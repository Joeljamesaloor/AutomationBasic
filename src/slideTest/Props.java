package slideTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.remote.MobileCapabilityType;

public class Props {

	@Test
	public static AndroidDriver <AndroidElement> capLock() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		File appDir = new File("src");

		File app = new File(appDir, "newsapp.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2xl");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;

	}

	@Test
	public  AndroidDriver<AndroidElement> wifiOff() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> wifi ;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2xl");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		wifi = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		wifi.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
		return wifi;
	}
	
	
	@Test
		public  AndroidDriver<AndroidElement> wifiOn() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> wifi ;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2xl");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		wifi = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		wifi.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
		return wifi;
	}

}
