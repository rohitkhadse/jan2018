package com.rohitkhadse;

import junit.framework.TestCase;

public class StringAddTest extends TestCase {

	public void testadd() {

		assertEquals(350, StringAdd.add(30, 320));
	}

	public void testconvert() {

		assertEquals(1234, StringAdd.convert("1234"));
	}
}
