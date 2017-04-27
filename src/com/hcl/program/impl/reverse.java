package com.hcl.program.impl;

public class reverse {
	
	public static String Reverse_String(String word){
		
		String [] Before_Reverse=word.split("");
		String	Reverse_Word=" ";
			
			for(int i=Before_Reverse.length-1;i>1;i--){
				
				Reverse_Word+=Before_Reverse[i];		
			}
				
				return Reverse_Word;
		}


}
