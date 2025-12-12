/*
 * Class: CMSC201
 * Instructor: Grigoriy Grinberg
 * Description: Make a JUnit  test class to test methods of length, charAt, substring, and indexOf
 * Due 12/16/24
 * I pledge that U gave completed the programming assignment independently. I have not copied the code from a student or any source.
 * I have not given my code to any student
 * Name: Graeham Galler
 */
package Project6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void lengthish() {
		String argh = "This is a string!";
		int expect =17;
		
		
		assertEquals(expect, argh.length());
		
	}
	
	@Test
	void characterish() {
		String yarg = "I am also a string!";
		assertEquals('I', yarg.charAt(0));
	}

	
	@Test
	void substringish() {
		String string1 = "I too, wish to be a string... oh wait!";
		String expect = "I too";
		String equal = string1.substring(0, 5);
		
		assertEquals(expect, equal);
	}
	
	@Test
	void indexOfish() {
		String string2 = "Why oh why am I forced to be a string?";
		int location = string2.indexOf('I');
		assertEquals(14, location);
	}
}

