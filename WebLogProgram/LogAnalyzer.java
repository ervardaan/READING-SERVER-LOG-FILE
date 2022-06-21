
/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
   
     public LogAnalyzer() {
         // complete constructor
         records=new ArrayList<LogEntry>();
     }
        
     public void readFile(String filename) {
         // complete method
         FileResource fr=new FileResource(filename);
         for(String l:fr.lines())
         {
             records.add(WebLogParser.parseEntry(l));
            }
            
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     public void uniqueip()
     {
           ArrayList<String> new_copy=new ArrayList<String>();
         for(LogEntry l:records)
         {
             
             if(! new_copy.contains(l.getIpAddress()))
             {
                new_copy.add(l.getIpAddress());
            }
        }
        System.out.println(new_copy.size());
            
     
     
}
public void noofvisits()
{
    HashMap<String,Integer> hm1=new HashMap<String,Integer>();
    
    for(LogEntry l:records)
    {
        String curip=l.getIpAddress();
        if(hm1.containsKey(curip))
        {
            int c=hm1.get(curip);
            hm1.put(curip,c+1);
        }
        else{
            hm1.put(curip,1);
        }
    }
    System.out.println(hm1);
}
        
public void printAllHigherThanNum(int num)
{
    for(LogEntry l:records)
    {
        if(l.getStatusCode()>=num)
        {
            System.out.println(l);//uses toString() method
        }}}
public ArrayList<String> uniqueIpAddressPerDay(String s)
{
    ArrayList<String> ipcollect=new ArrayList<String>();
    for(LogEntry l1:records)
    {
        String ch=(l1.getAccessTime()).toString();
        // get date object and then call toString() to get date as a string
        if(ch.equals(s))
        {
           ipcollect.add(l1.getIpAddress());
        }
    }
    return ipcollect;
}
}
