package Arrayylist;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
 
public class Hashmap {
    
    public static void main(String[] args) 
    {
         
        HashMap<String, Integer> map = new HashMap<String, Integer>();
         
         
        map.put("Saritha mallam",4);         
        map.put("Latish mallam", 3);         
        map.put("Ektha mallam", 4);         
        map.put("Krithik mallam", 5);        
        map.put("Sayitha john",4);
        map.put("Sanvi kumar",4);
        map.put("Sahil shety ",4);
        map.put("Sunil kovar",4);
            
        

         
         
        Set<Entry<String, Integer>> entrySet = map.entrySet();
         
        for (Entry<String, Integer> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         
         
         
         
        
         
        
         
                
         
        }
    }   



