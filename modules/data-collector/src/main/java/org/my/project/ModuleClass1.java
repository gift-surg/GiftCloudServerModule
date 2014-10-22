package org.my.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ModuleClass1 {

	/**
	 * This is a placeholder class provided as an example of where the Java code
	 * for the module should go. Rename/remove as desired.
	 */

	public void readAndPrint(String resource) throws IOException {
		InputStream inStream = this.getClass().getResourceAsStream(resource);
		BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
		String line = null;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
	}
}
