package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		//if(candidateSolution.length() != 81){
			//throw new InvalidParameterException("Candidate should be 81 characters");
		//}
		
		//only numbers 1-9
		if(!candidateSolution.matches("[1-9]+")){
			return -1;
		}
		
		String[] lines = candidateSolution.split("(?<=\\G.{9})");
		System.out.print(lines[0]);
		if(!hasNumberOnlyOnce(lines[0])){
			return -3;
		}
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public Boolean hasNumberOnlyOnce(String substring){
		List<String> tried = new ArrayList<String>();
		
		for (int i = 0; i < substring.length(); i++){
		    String c = Character.toString(substring.charAt(i));        
		    
		    if(tried.contains(c)){
		    	return false;
		    }else{
		    	tried.add(c);
		    }
		}
		
		return true;
	}
}
