//TreeMap<String, List<String>> sorted=new TreeMap<>();
//sorted.putAll(map);
import java.util.Map;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
class Dictionary
{	
	public static Map<String, List<String>> arrayToList(List<String> words) 
	{
		TreeMap<String, List<String>> map = new TreeMap();
            	for(String word: words)
		{
            		String firstChar = String.valueOf(word.charAt(0));
                	if (map.get(firstChar) == null)
			{
                    		map.put(firstChar, new ArrayList(Arrays.asList(word)));
                	}
                	else
			{
                    		map.get(firstChar).add(word);
                	}       
		}
		//TreeMap<String, List<String>> sorted = new TreeMap<>();
		//sorted.putAll(map); 
		return map;
	}
	public static void printWords(String key,Map<String, List<String>> map) 
	{
		if(map.get(key)==null)
		{
			System.out.println("can't find the word of this Character: "+key);
		}
		else
		{	 
			System.out.println(key+" "+map.get(key));
		}	
	}
	public static void printAll(Map<String, List<String>> map) 

	{
		for (Map.Entry<String,List<String>> word : map.entrySet()) 
            	System.out.println("Key = " + word.getKey() +", Value = " + word.getValue());	
		//	 System.out.println(key+" "+map.get(key));	
	}		
}
class MyApp
{	
	public static void main(String args[])
	{
		Dictionary Dic=new Dictionary();
		List<String> words = 
        	new ArrayList(Arrays.asList("attach","auth","attach", "access", "agent", "bit","byte","batch", "char","city","country","mahmoud","dictionary","dummy","declare","exam","exit","integer","data","entry","omar","java","object","orinted"));
		Collections.sortedset(words);
		if(args.length !=0)
		{
		Dic.printWords(args[0],Dic.arrayToList(words));
		}
		else
		{		
		Dic.printAll(Dic.arrayToList(words));
		}
	}
	
}