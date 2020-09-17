
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vCount = 0;    
        
            
        String str = "This is a really simple sentence";    
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            
            }   
        }    
        System.out.println("Number of vowels are: " + vCount);    
         
	}

}
