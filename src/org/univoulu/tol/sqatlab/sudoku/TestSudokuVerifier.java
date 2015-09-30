package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testVerify() {
		String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(0, verifier.verify(correctString));
	}
	
	@Test
	public void testVerifyCharacters() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(-1, verifier.verify("a"));
	}

}
