package service;

// Create a class called FlamesCheckService
public class FlamesCheckService{
	
	// FlamesCheckService has a method findFlames to find the flames between two names
	// char findFlames(String name1, String name2) takes two strings as arguments
	public char findFlames(String name1 , String name2) {
		// Your task is to calculate the flames value and return the corresponding character as output 
		int count=0;
		for(int i=0;i<20;i++) {
			if(name1.charAt(i) != name2.charAt(i)) {
				count++;
			}
		}
		
		// You must return only the following values ['f','l','a','m','e','s']
		for(int i=1;i<=count;i++) {
			if(i==1)
				return 'f';
			else if(i==2)
				return 'l';
			else if(i==3)
				return 'a';
			else if(i==4)
				return 'm';
			else if(i==5)
				return 'e';
			else if(i==6)
				return 's';
			
		}
		// change the return value at the end of the method corresponding to your return value

		return 'f';
		
	}
	
	
}
