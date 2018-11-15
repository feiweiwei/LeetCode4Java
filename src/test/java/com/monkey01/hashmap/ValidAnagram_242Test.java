package com.monkey01.hashmap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: feiweiwei
 * @description:
 * @created Date: 12:05 2018/10/30.
 * @modify by:
 */
public class ValidAnagram_242Test {
	@Test
	public void isAnagram() throws Exception {
		String str1 = "a";
		String str2 = "b";

		ValidAnagram_242 validAnagram_242 = new ValidAnagram_242();
		Assert.assertEquals(true, validAnagram_242.isAnagram(str1, str2));
	}

}