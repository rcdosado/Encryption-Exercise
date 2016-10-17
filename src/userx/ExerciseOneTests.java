package userx;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ExerciseOneTests {

	@Test 
	public void testreadSecretMessageFromAgency() throws IOException
	{
		assertEquals("error in Reading File", "80", SecretMessageReader.ReadLine("SecretMessage.txt",1));
		assertEquals("Error in Readline","Every Good Boy Does Fine", SecretMessageReader.ReadLine("SecretMessage.txt", 2));
	}

	/*
	 * This function takes an integer as parameter, and returns to you the highest 
	 * prime number between zero and the prime number limit (for example, if the 
	 * prime number limit is 100, this function will return 97
	 */
	@Test
	public void testgetEncryptionPrimeExist() {
		assertEquals("error in Help Method",  "Derp", ExerciseOne.Help());
	}

}
