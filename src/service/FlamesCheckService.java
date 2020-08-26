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
		switch(count) {
		case 1 : if(count==1)
					return 'f';
					break;
		case 2 : if(count==2)
					return 'l';
					break;
		case 3: if(count==3)
					return 'a';
					break;
		case 4: if(count ==4)
					return 'm';
					break;
		case 5: if(count==5)
					return 'e';
					break;	
		case 6 : if(count==6)
					return 's';
					break;
		}
		// change the return value at the end of the method corresponding to your return value

		return 'f';
	}
	
	
}
