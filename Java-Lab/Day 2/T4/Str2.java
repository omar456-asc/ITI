class Task21{
 
    
    public static void main(String args[]) {
    String str="develops people and ITI house of develope and ITI for people";	
        String strFind = "ITI";
        
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
            count++;
            fromIndex++;            
        }
        
        System.out.println("Total occurrences: " + count);
        }
    }
