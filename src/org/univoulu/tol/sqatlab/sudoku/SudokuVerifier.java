package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		//if(candidateSolution.length() != 81){
			//throw new InvalidParameterException("Candidate should be 81 characters");
		//}
		
		if(!candidateSolution.matches("[0-9]+")){
			return -1;
		}
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
}
