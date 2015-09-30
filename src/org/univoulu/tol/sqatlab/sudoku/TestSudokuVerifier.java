package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testVerifyExpectZero() {
		String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(0, verifier.verify(correctString));
	}
	
	@Test
	public void testVerifyCharacters() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-1, verifier.verify("a"));
	}
	@Test
	public void testVerifyCharactersZero() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-1, verifier.verify("0"));
	}
	
	@Test
	public void testVerifyLineHasDigitsOnlyOnceWThreeOnes() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-3, verifier.verify("1111111111"));
	}
	
	@Test
	public void testVerifyLineHasDigitsOnlyOnceWTwoTwos() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-3, verifier.verify("22222222222222"));
	}
	
	@Test
	public void testVerifyLineHasDigitsErrorAtSecondLine() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-3, verifier.verify("417369825123456799"));
	}
	
	@Test
	public void testVerifySubgridFirstAndTenthAreSame() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-2, verifier.verify("4173698254"));
	}
	

}
