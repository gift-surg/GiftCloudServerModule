package org.my.project;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class ModuleClass1Test {

	/**
	 * This is a placeholder class provided as an example of where the Java tests
	 * for the module should go. Rename/remove as desired.
	 */
	
	@Test
	public void moduleMethodTest() throws IOException {
		ModuleClass1 mc1 = new ModuleClass1();
		mc1.readAndPrint("/ModuleTestResource.txt");
	}
}
