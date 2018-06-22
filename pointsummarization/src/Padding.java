import java.util.*;
public class Padding {
    
    ArrayList<String> needItemsToAdd = new ArrayList<String>();
    ArrayList<String> sou = new ArrayList<String>();
    ArrayList<String> rai = new ArrayList<String>();
    
    public ArrayList<String> getAllItemsToAdd(ArrayList<String> source,ArrayList<String> raised){
        needItemsToAdd.clear();
        sou.clear();
        rai.clear();
        sou = source;
        rai = raised;
        try{
        
        ArrayList<String> l3 = new ArrayList<String>(rai);
        l3.retainAll(sou);
        
        rai.removeAll(l3);
        needItemsToAdd = rai;
        }catch(Exception e){
            System.out.println(e);
        }
        
        return needItemsToAdd;
        
    }
    
}
