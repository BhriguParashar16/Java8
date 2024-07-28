package LeetCode;

import java.util.ArrayList;
import java.util.List;



/*
 * item[i]=[type,color,name]
 * 
 * rulekey,rulevalue   --> ( type,type i)
 * rulekey,rulevalue   --> ( color,color i)
 * 
 */
public class LeetProblems {


	
	
	
	
	public static int countMatches(List<List<String>> items,String ruleKey,String ruleVal) {
		
		int res=0;
		
		for(int i=0;i<items.size();i++) {
			if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleVal)) res++;
			if(ruleKey.equals("color") && items.get(i).get(0).equals(ruleVal)) res++;
			if(ruleKey.equals("value") && items.get(i).get(0).equals(ruleVal)) res++;
		}
		
		return res;
	}
}
