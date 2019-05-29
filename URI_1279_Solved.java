
package javaapplication25;
import java.math.*;
import java.util.*;

public class JavaApplication25 {

    public static void main(String[] args) {
        
        BigInteger Four = new BigInteger("4");
        BigInteger FourHundred = new BigInteger("400");
        BigInteger OneHundred = new BigInteger("100");
        BigInteger FiftyFive = new BigInteger("55");
        BigInteger Fifteen = new BigInteger("15");
        Scanner sc = new Scanner(System.in);
        boolean newLine=true;
        
        while(sc.hasNext()){
        boolean leapYear, buluFes, huluFes;
        leapYear = buluFes = huluFes = false;
        String str = sc.next();
            if(newLine!=true){
                System.out.print("\n");
            }
        BigInteger i = new BigInteger(str);

            if(((i.remainder(Four).equals(BigInteger.ZERO)) && !(i.remainder(OneHundred).equals(BigInteger.ZERO))) || (i.remainder(FourHundred).equals(BigInteger.ZERO))){
                System.out.println("This is leap year.");
                leapYear=true;
            }
            
            if(i.remainder(Fifteen).equals(BigInteger.ZERO)){
                System.out.println("This is huluculu festival year.");
                buluFes=true;
            }
            
            if(leapYear!=false){
                if(i.remainder(FiftyFive).equals(BigInteger.ZERO)){
                    System.out.println("This is bulukulu festival year.");
                    huluFes=true;
                }
            }
            
            if(leapYear!=true && buluFes!=true && huluFes!=true){
                System.out.println("This is an ordinary year.");
            }
            
            newLine = false;
        }
        
    }
    
}