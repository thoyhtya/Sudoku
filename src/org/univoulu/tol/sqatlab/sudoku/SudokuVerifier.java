package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		//if(candidateSolution.length() != 81){
			//throw new InvalidParameterException("Candidate should be 81 characters");
		//}
		
		//only numbers 1-9 allowed
		if(!candidateSolution.matches("[1-9]+")){
			return -1;
		}
		
		//returns -2 if candidate has multiple same digits in same vertical column
		if(errorInColumns(candidateSolution)){
			return -2;
		}
		
		//returns -3 if candidate has multiple same digits in same row
		if(errorInLines(candidateSolution)){
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
	
	public Boolean errorInLines(String candidate){
		String[] lines = candidate.split("(?<=\\G.{9})");
		for(int i = 0; i<lines.length; i++){
			if(!hasNumberOnlyOnce(lines[i])){				
				return true;
			}
		}
		return false;
	}
	
	public Boolean errorInColumns(String candidate){
		return false;
	}
}
