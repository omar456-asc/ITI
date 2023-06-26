class IP{

    static void IpSpliter(String ip ){
        String arr[] = ip.split("\\.");
 	
    	// System.out.println(arr.length);
    	// System.out.println(ip);

    
         for (int i = 0; i < arr.length; i++)
         	   System.out.println(arr[i]); 	   

    }//ENND Ippliter


    public static void main(String args[]){

        // String ip = "129.3.20.0";
        
	   IpSpliter(args[0]);
		

    }


}