package assignment5;

/* assignment 5(abstract class):
interface : hardware
methods : hardwareresources()
create another one interface
interface :software
methods : softwareresources()
class : desktop
methods : desktopmodel()
description:
create 2 interface and archieve multiple inheritance.
*/
public class Desktop implements Hardware,Software {

	
	public void SoftwareResources() {
		
		
	}

	public void HardwareResources() {
		
		
	}


public static void main(String[] args)
{
	Desktop mylap=new Desktop();
      mylap.HardwareResources();
      mylap.SoftwareResources();
}
}
