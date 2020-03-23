package com.epam.TDD.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceFirst2CharsTest {
	
	/*TODO list for my feature
	 * 1. 0 chars : ""  => ""
	 * 2. 1 chars : A => ""
	 * 3. 1 chars : B => B
	 * 4. 2 chars : AA => ""
	 * 5. n chars : AABCDE => BCDE
	 * 6. n chars : BBAA => BBAA
	 * 7. n chars : BACD => BCD
	 * 8. n chars : AABAA => BAA
	 *
	 *  
	 */
	ReplaceFirst2Chars ReplaceFirst;
	@BeforeEach
	void setup() {
		ReplaceFirst = new ReplaceFirst2Chars();
		
	}
	@Test
	void testemptychars() {
	
		
		assertEquals("",ReplaceFirst.change(""));
		
	}
	@Test
	void test1chars() {
		
		assertEquals("",ReplaceFirst.change("A"));
		
	}
	@Test
	void testanother1chars() {
		
		
		assertEquals("B",ReplaceFirst.change("B"));
		
	}
	@Test
	
	void test2chars() {
		
		 
		assertEquals("",ReplaceFirst.change("AA"));
		
	}
	@Test
	
	void testnchars() {
		
		
		assertEquals("BCDE",ReplaceFirst.change("AABCDE"));
		
	}
	
	@Test
	void testanothernchars() {
		assertEquals("BBAA",ReplaceFirst.change("BBAA"));
	}
	
	@Test
	void testchars() {
		assertEquals("BCD",ReplaceFirst.change("BACD"));
	}
	
	@Test
	void test() {
		assertEquals("BAA",ReplaceFirst.change("AABAA"));
	}

	

}
