package com.monkey01.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 10:51 18/10/17.
 * @modify by:
 */
public class ValidParentheses_20Test {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void isValid() throws Exception {

		ValidParentheses_20 validParentheses_20 = new ValidParentheses_20();
		String s = "{([])}";
		String s1 = "{()";
		String s2 = "]]{{";

		Assert.assertEquals(true, validParentheses_20.isValid(s));
		Assert.assertEquals(false, validParentheses_20.isValid(s1));
		Assert.assertEquals(false, validParentheses_20.isValid(s2));

		Assert.assertEquals(true, validParentheses_20.isValid2(s));
		Assert.assertEquals(false, validParentheses_20.isValid2(s1));
		Assert.assertEquals(false, validParentheses_20.isValid2(s2));

	}

}