import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void test3()
	{
		Reporter.log("3",true);
	}
	@Test(priority=1)
	public void test4()
	{
		Reporter.log("4",true);
	}
	}

