package spoon.test.main;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMain() throws Exception {
//		for (Object p : System.getProperties().entrySet()) {
//			System.out.println(p);
//		}
		spoon.Launcher.main(new String[] {
				"-i", "src/main/java", 
				"-o", "target/spooned",
				"--source-classpath", System.getProperty("java.class.path")
		});
		// we should have no exception
	}

}
