package com.maven.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MainTest {
	@Test
	public void Create() {
		Reporter.log("maven", true);
	}
}
