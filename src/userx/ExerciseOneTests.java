package userx;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExerciseOneTests {

	@Test 
	public void testreadSecretMessageFromAgency()
	{
		assertEquals("error in Reading File", "80", SecretMessageReader.ReadLine());
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
