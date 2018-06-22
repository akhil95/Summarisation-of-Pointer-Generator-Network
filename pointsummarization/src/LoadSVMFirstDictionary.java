import java.io.*;
import java.util.*;
public class LoadSVMFirstDictionary {
    
    ArrayList<String> dictionaryKeys = new ArrayList<String>();
    String EOL = "\r\n";    
    public ArrayList<String> getKeyWordList(String filePath){
        dictionaryKeys.clear();
        try{
        FileInputStream fis = new FileInputStream(filePath);
        byte b[] = new byte[fis.available()];
        fis.read(b);
        fis.close();
        String allFileData = new String(b);
        allFileData = allFileData.trim();
        StringTokenizer st = new StringTokenizer(allFileData,EOL);
        while(st.hasMoreTokens()){
           dictionaryKeys.add(st.nextToken()); 
        }
        }catch(Exception e){
            System.out.println(e);
        }     
        return dictionaryKeys;
    }
    
}
