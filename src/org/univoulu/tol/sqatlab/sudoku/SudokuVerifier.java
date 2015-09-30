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
		
		String[] lines = candidateSolution.split("",9);
		if(hasNumberOnlyOnce(lines[0])){
			return -3;
		}
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public Boolean hasNumberOnlyOnce(String asd){
		return true;
	}
}
