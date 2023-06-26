class  Str1{

    static int wordOccurrances(String str ,String word){
        String arr[] = str.split(word);
 
        int count = 0;

        for (int i = 0; i < arr.length; i++)
       	
       	      
		count++;

      	   
 
	    return count;
    }


    public static void main(String args[]){

        String text = "ITI develop people and ITI house of develop and ITI for people";
	   String word = "ITI";
	   int res= wordOccurrances(text,word);
		
		if(res >0)
			System.out.println("The count is : "+ res);
		else
			System.out.println(word + " not found" );
		

    }
}