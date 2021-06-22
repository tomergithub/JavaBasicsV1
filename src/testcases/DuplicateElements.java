package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]= {"Java","JAvaScript","Ruby","C","Python","Java"	};
	for(int i=0;i<names.length;i++) {
		for(int j=i+1;j<names.length;j++)
		{
			if(names[i].equals(names[j]))
			{System.out.println("duplicate elemneis"+names[i]);
				
			}
		}
	}
	Set<String> store=new HashSet<String>();
	
	for(String name : names)
	{if(store.add(name)==false)
	{
		System.out.println("Duplicate is"+name);
	}
		
	}
	
	
	}

}
