
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        // complete method
         LogAnalyzer la=new LogAnalyzer();
        la.readFile("short-test_log");
        la.printAll();
        la.uniqueip();
        la.printAllHigherThanNum(300);
        System.out.println("new method used");
        la.noofvisits();
        
        /* LogAnalyzer la2=new LogAnalyzer();
        la2.readFile("C:\\Users\\varda\\Downloads\\UniqueIPData\\weblog-short_log");
        
        
        System.out.println(la2.uniqueIpAddressPerDay("Sep 14")); */
    }
}
