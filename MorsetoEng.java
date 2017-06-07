/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morsetoeng;

import java.util.ArrayList;

/**
 *
 * @author anilkaynar
 */
public class MorsetoEng {
public char[] Alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','y','z'};
      public String []Morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
         ".-.","...","-","..-","...-","-.--","--.."
         };
   public static int lenal;

    public MorsetoEng() {
        lenal=Alphabet.length;
    }
   
    public String EnglishToMorse(String Text){
        for(int i=0;i<Alphabet.length;i++){
            Text=Text.replaceAll(Alphabet[i]+"",Morse[i]);
        }
         return Text;
    }
    public String MorseToEnglish(String morse){
         String[] denemeler=morse.split(" ");
        String str="";
        
        for (String  strm : denemeler) {
            for(int i=0;i<Alphabet.length;i++){
            if(strm.equalsIgnoreCase(Morse[i]+"")){
                str+=Alphabet[i];
                System.out.println("İçeri "+Alphabet[i]);
            }
            }
        }
    return str;
    }
    public static void main(String[] args) {
        
        String English="anil Kaynar";
        English=English.replaceAll("a",".-");
        System.out.println(English);
        MorsetoEng instence=new MorsetoEng();
        String ti=instence.EnglishToMorse("anil kaynar");
        System.out.println("Morsed Text:\t"+ti);
        String deneme=".... .- ... .- -.     -.- .- -.-- .- -.-- .- -.-- .- .- -.-- .- -.-- .- -.-- .-";
       String[] denemeler=deneme.split(" ");
       String ayyheyecan=instence.MorseToEnglish(deneme);
       System.out.println("Bitti mi acaba\t"+ayyheyecan);
    }
    
}
