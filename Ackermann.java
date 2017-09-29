/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.math.BigInteger;

/**
 *
 * @author anilkaynar
 */
public class Ackermann {
    public BigInteger ackermannFunction(BigInteger m,BigInteger n){
        System.out.println(m+" "+n);
        if(m.equals(BigInteger.ZERO)){
            return n.add(BigInteger.ONE);
        }
        int temp=m.compareTo(BigInteger.ZERO);
        boolean ilkif=false;
        if(temp>0){
        ilkif=true;
        }
        if(ilkif&&  n.equals(BigInteger.ZERO)){
            return ackermannFunction(m.subtract(BigInteger.ONE),BigInteger.ONE);   //m-1,1
        }
        temp=m.compareTo(BigInteger.ZERO);
        boolean ikinciifon1=false;
        if(temp>0){
          ikinciifon1=true;
        }
          temp=n.compareTo(BigInteger.ZERO);
          boolean ikinciifon2=false;
        if(temp>0){
          ikinciifon2=true;
        }
        if( ikinciifon1&& ikinciifon2){ //m>0 && n>0
        return ackermannFunction(m.subtract(BigInteger.ONE), ackermannFunction(m,n.subtract(BigInteger.ONE))); //m-1 ))n-1
        }
       return null;
    }
}
