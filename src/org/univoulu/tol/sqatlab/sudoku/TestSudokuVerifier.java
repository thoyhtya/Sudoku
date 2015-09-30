package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testVerify() {
		SudokuVerifier verifier = new SudokuVerifier();
	}
	
	@Test
	public void testVerifyLength1Return() {
		SudokuVerifier verifier = new SudokuVerifier();
		int result = verifier.verify("a");
	}

}
