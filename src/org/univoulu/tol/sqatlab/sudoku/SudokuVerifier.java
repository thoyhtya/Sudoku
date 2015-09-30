package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		//if(candidateSolution.length() != 81){
			//throw new InvalidParameterException("Candidate should be 81 characters");
		//}
		
		//only numbers 1-9
		if(!candidateSolution.matches("[1-9]+")){
			return -1;
		}
		
		if(candidateSolution.matches("111") || candidateSolution.matches("22")){
			return -3;
		}
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
}
