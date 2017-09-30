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
        //System.out.println(m+" "+n);
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
        //StackOverflow occur when even 4,2 because of i thing BigInteger
       return null;
    }
    public int ackermannfunctioninteger(int m,int n){
        if(m==0){
            return n+1;
        }
        else if(n==0){
           return ackermannfunctioninteger(m-1,1);
        }
        else {
            return ackermannfunctioninteger(m-1,ackermannfunctioninteger(m,n-1));
        }
    }
        public int Ack(int m,int n){
        if (m == 0) {
         return n + 1;
    } else if (n == 0) {
        return Ack(m - 1, 1);
    } else {
        return Ack(m - 1, Ack(m, n - 1));
    }
        }
}
