/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theory_assi;
import java.util.regex.*;
/**
 
 */
public class Theory_assi {
    
 private static final String REGEX = "(\\D{2}\\w{3}\\D{1}\\w{3}\\/?)|(\\w{5}|\\w{4})(\\D{3})(\\w{3}\\D{1}\\w{3}\\D{1})(\\w{3}\\D{1}\\w{3}\\/?\\w{3}|(\\w{3}\\D{1}\\w{3}))";
private static final String INPUT = "https://foo.bar.com/baz/FOO\n" +
                                    "http://foo.bar.com/baz\n"+
                                    "//foo.bar/\n" +
                                    "//foo.bar";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Pattern p = Pattern.compile(REGEX);
Matcher m = p.matcher(INPUT); // get a matcher object
int count = 0;
while(m.find()) {
count++;
System.out.println("Match number "+count);
System.out.println("start(): "+m.start());
System.out.println("end(): "+m.end());
}
       
    }
    
}
