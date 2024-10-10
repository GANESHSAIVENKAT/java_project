package test.com.google.project.testrunner;

import test.com.google.project.test.Devices;
import test.com.google.project.test.Mobile;

public class DeviceRunner {

	 public static void main(String[] args) {
		 Mobile device=new Mobile();
		

		device.brandName();
		device.price();
		device.weight();
		device.rating();
		device.manufactureYear();
		device.colour();
		device.processor();
		device.version();
		device.ram();
		device.internalspace();
	}
}
