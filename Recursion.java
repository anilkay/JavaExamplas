/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author anilkaynar
 */
public class Recursion {
    public String notstatic="I am not a static variable";
    public static int bol=14;
    public int digeryirmisek;
    public int[] fizzArray(int n) {
  int []array=new int[n];
  for(int i=0;i<n;i++)array[i]=i;
  return array;
}
    public List wordsWithoutList(String[] words, int len) {
  ArrayList list=new ArrayList();
  for(String i:words){
    if(i.length()!=len){
      list.add(i);
    }
  }
  return list;
}
    public String startWord(String str, String word) {
  if(str.length()<1)return "";
  if(str.length()<word.length())return "";
  if(str.substring(1,word.length()).equals(word.substring(1))){
    return str.substring(0,word.length());
  }
  return "";
}
    public String minCat(String a, String b) {
  int alen=a.length();
  int blen=b.length();
  if(alen==blen)return a+b;
  if(alen==0 ||blen==0)return "";
  if(alen>blen){
    return a.substring(alen-blen,alen)+b;
  }
  else {
    return a+b.substring(blen-alen,blen);
  }
}
public String repeatFront(String str, int n) {
  String temp="";
  int len=str.length();
  for(int i=0;i<n;i++){
    temp+=str.substring(0,n-i);
  }
  return temp;
}   
    public boolean endOther(String a, String b) {
  a=a.toLowerCase();
  b=b.toLowerCase();
  int alen=a.length();
  int blen=b.length();
  if(alen>blen){
    return a.substring(alen-blen,alen).equals(b);
  }
  else if(alen==blen){
    return a.equals(b);
  }
  else {
        return b.substring(blen-alen,blen).equals(a);
  }
}
    
    public String oneTwo(String str) {
  StringBuilder builder=new StringBuilder();
  int len=str.length();
  for(int i=0;i<len;i=i+3){
    if(i+2<len){
    String iki="";
    char uc=str.charAt(i);
      char bir=str.charAt(i+1);
       iki=""+str.charAt(i+2);
      builder.append(""+bir+iki+uc);
    }
  }
  return builder.toString();
}

    
    public String stringSplosion(String str) {
  String a="";
  int j=1;
  for(int i=0;i<=str.length();i++){
    a+=str.substring(0,i);
  }
  return a;
}
public int[] make2(int[] a, int[] b) {
  //return new int[]{3,5};
  int[]rint=new int[2];

  if(a.length>1){
    rint[0]=a[0];
    rint[1]=a[1];
  }
  else if(a.length>0 &&b.length>0){
    rint[0]=a[0];
    rint[1]=b[0];
  }
  else {
    rint[0]=b[0];
    rint[1]=b[1];
  }
  return rint;
}

    
    public int maxBlock(String str) {
  char []et=str.toCharArray();
  int max=0;
  int len=str.length();
  if(len==0)return 0;
  for(int i=0;i<len-1;i++){
    int howMany=0;
    for(int j=i+1;j<len;j++){
      if(et[i]==et[j])howMany++;
      else break;
    }
    if(howMany>max)max=howMany;
    howMany=0;
  }
  return max+1;
}

    
    public List<String> noX(List<String> strings) {
  return strings.stream().map(n->n.replaceAll("x","")).collect(Collectors.toList());
}
public int countCode(String str) {
  int len=str.length();
  int howMany=0;
  for(int i=0;i<len-3;i++){
    if(str.substring(i,i+2).equals("co")){
      if(str.charAt(i+3)=='e')howMany++;
    }
  }
  return howMany;
}

    public int noTeenSum(int a, int b, int c) {
  int sum=0;
  sum+=fixTeen(a);
    sum+=fixTeen(b);
      sum+=fixTeen(c);
      return sum;
}
public int fixTeen(int a){
  if(a>=13 && a<=19 &&a!=15 &&a!=16)return 0;
  return a;
}
    public boolean makeBricks(int small, int big, int goal) {
       int libir=1;
       int bigbir=5;
       if(bigbir*big+small*libir<goal)return false;
       if(big==0 &&libir*small<goal)return false;
       if(goal%bigbir<=(libir*small))return true;
       if(small==0 &&goal%bigbir!=0)return false;
       else return false;
}

    public boolean cigarParty(int cigars, boolean isWeekend) {
  if(cigars<40)return false;
  if((cigars>=40 &&cigars<=60)||isWeekend)return true;
  return false;
}

    public boolean scoresIncreasing(int[] scores) {
  boolean secim=true;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]>scores[i+1])secim=false;
  }
  return secim;
}

    public boolean scores100(int[] scores) {
  boolean sevim=false;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]==100){
      if(scores[i+1]!=100){
       sevim=false;
      }
    }
     if(scores[i]==100){
      if(scores[i+1]==100){
       sevim=true;
       break;
      }
    }
  }
  return sevim;
}

    public int wordsCount(String[] words, int len) {
  int howMany=0;
  for(String i: words){
    if(i.length()==len){
      howMany++;
    }
  }
  return howMany++;
}
    public String middleTwo(String str) {
  int len=str.length();
  if(len%2==0){
    return str.substring(len/2-1,len/2+1);
  }
  return "";
}

    public String deFront(String str) { 
 String arbi="";
 if(str.charAt(0)=='a' ||str.charAt(0)=='a'){
  arbi=arbi+str.charAt(0);
 }
  if(str.charAt(1)=='b' ||str.charAt(1)=='b'){
  arbi=arbi+str.charAt(1);
 }
 return arbi+str.substring(2,str.length());
}
    
public int sumDigits(String str) {
  int sum=0;
  for(int i=0;i<str.length();i++){
   byte b= (byte)str.charAt(i);
        if(b>=48 &&b<=57){
          sum+=b-48;
        }
  }
  return sum;
}

    public boolean hasBad(String str) {
  if(str.length()<=2){
    return false;
  }
  if(str.length()==3){
    return "bad".equals(str);
  }
  if(!"b".equals(str.substring(0,1)) ){
    if(!"b".equals(str.substring(1,2))){
      return false;
    }
  }
  return true;
}
public String withouEnd2(String str) {
  if(str.length()<=2){
    return "";
  }
  return str.substring(1,str.length()-1);
}

    public String comboString(String a, String b) {
  int alen=a.length();
  int blen=b.length();
  if(alen>blen){
    return b+a+b;
  }
  else {
    return a+b+a;
  }
}
public String[] wordsFront(String[] words, int n) {
  String[] arr=new String[n];
  if(n==1){
    return new String[]{words[0]};
  }
  for(int i=0;i<n;i++){
    arr[i]=words[i];
  }
  return arr;
}
    public boolean haveThree(int[] nums) {
  ArrayList<Integer> index=new ArrayList<>();
  int howMany=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==3){
      howMany++;
      index.add(i);
    }
  }
  for(int i=0;i<index.size()-1;i++){
    int sonuc=index.get(i+1)-index.get(i);
    if(sonuc==1){
      return false;
    }
  }
  if(howMany==3){
    return true;
  }
  return false;
}

    public boolean has77(int[] nums) {
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]==7 && nums[i+1]==7)return true;
  }
  for(int i=0;i<nums.length-2;i+=1){
    if(nums[i]==7 && (nums[i+2]==7)){return true;}
  }
  return false;
}

    public String mixString(String a, String b) {
  StringBuilder c=new StringBuilder();
  int i=0;
  for(;i<a.length();i++){
    if(a.length()<=i ||b.length()<=i){
      break;
    }
    c.append(a.charAt(i));
    c.append(b.charAt(i));
  }
  if(i<a.length()){
      for(int j=i;j<a.length();j++){
        c.append(a.charAt(j));
      }
  }
  if(i<b.length()){
     for(int j=i;j<b.length();j++){
        c.append(b.charAt(j));
      }
  }
  return c.toString();
}
    public static double context(){
        return 0;
    //return digeryirmisek/bol;//nonstatic variable cant be referenced static context;
    }
    static void notstaticwrite(){
   // System.out.println(notstatic); Non static variable cannot ba referenced in static context
    }
    public int start1(int[] a, int[] b) {
  int howMany=0;
  if(a.length>=1){
  if(a[0]==1){
    howMany++;
  }
  }
  if(b.length>=1){
  if(b[0]==1){
    howMany++;
  }}
  return howMany;
}
public int[] shiftLeft(int[] nums) {
  int len=nums.length;
  if(len==0){
    return nums;
  }
  int temp=nums[0];
  for(int i=0;i<len-1;i++){
    nums[i]=nums[i+1];
  }
  nums[len-1]=temp;
  return nums;
}
public boolean has12(int[] nums) {
  int where1=-1;
  int where2=-1;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1){
      where1=i;
    }
     if(nums[i]==2){
      where2=i;
    }
  }
  if(where1<0 ||where2<0){
    return false;
  }
  if(where1>where2){
    return false;
  }
  return true;
}

    public String lastTwo(String str) {
        if (str.length() <= 1) {
            return str;
        }
        int strlen = str.length();
        String last2 = str.substring(strlen - 2, strlen);
        return str.substring(0, strlen - 2) + last2.charAt(1) + last2.charAt(0);
    }
public String withoutX2(String str) {
  if(str.length()>=2){
  String one="";
  String two="";
 if(str.charAt(0)!='x') one=str.charAt(0)+"";
 if(str.charAt(1)!='x')two=str.charAt(1)+"";
 return one+two+str.substring(2);
  }
  else if(str.length()==1){
    if(str.charAt(0)!='x'){
      return str;
    }
    else {
      return "";
    }
  }
  return str;
}

    /**
     * @param args the command line arguments
     */
    public static int count7(int n) {
        System.out.println("n: " + n);
        if (n <= 6) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }
   public String zipZap(String str) {
  StringBuilder build=new StringBuilder();
  int k=0;
  if(str.length()==0){
    return "";
  }
  if(str.length()==1){
    return str;
  }
  build.append(str.charAt(0));
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i+1)=='p'&& str.charAt(i-1)=='z'){
      k++;
    }
    else {
      build.append(str.charAt(i));
    }
  }
  build.append(str.charAt(str.length()-1));
  return build.toString();
}
public List<Integer> doubling(List<Integer> nums) {
  nums=nums.stream().map(n->n*2).collect(Collectors.toList());
  return nums;
}

    public static int count8(int n) {
        if (n <= 7) {
            return 0;
        }
        if (n % 100 == 88) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        } else {
            return count8(n / 10);
        }
    }

    public int countX(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        if (str.length() == 1 && str.charAt(0) == 'x') {
            return 1;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1, str.length()));
        } else {
            return countX(str.substring(1, str.length()));
        }
    }

    public int countHi(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(1, str.length()));
        } else {
            return countHi(str.substring(1, str.length()));
        }
    }

    public static int fibonacci(int n) {
        System.out.println("fib n " + n);
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "y" + changeXY(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + changeXY(str.substring(1, str.length()));
        }
    }

    public String noX(String str) {
        if (str.length() < 1) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return "" + noX(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + noX(str.substring(1, str.length()));
        }
    }
public String getSandwich(String str) {
   int son=str.lastIndexOf("bread");
      int bas=  str.indexOf("bread");
      if(bas==son){
        return "";
      }
      if(bas<0){
        return "";
      }
      if(bas+5>=str.length()){
        return "";
      }
      return str.substring(bas+5,son);
}


    public int bigDiff(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int max = 0;
        int min = 999;
        for (int i = 0; i < nums.length - 1; i++) {
            if (max < Math.max(nums[i], nums[i + 1])) {
                max = Math.max(nums[i], nums[i + 1]);
            }
            if (min > Math.min(nums[i], nums[i + 1])) {
                min = Math.min(nums[i], nums[i + 1]);
            }
        }
        return max - min;
    }
    public boolean catDog(String str) {
  int howCat=0;
  int howDog=0;
  for(int i=0;i<str.length()-2;i++){
    if("dog".equals(str.substring(i,i+3))){
      howDog++;
    }
      if("cat".equals(str.substring(i,i+3))){
      howCat++;
    }
  }
  return howDog==howCat;
}

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean twoTwo(int[] nums) {
        boolean isTrue = true;
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] != 2) {
                    isTrue = false;
                    break;
                }
            }
        }
        int len = nums.length;
        if (nums[len - 1] == 2) {
            if (nums[len - 2] != 2) {
                isTrue = false;
            }
        }
        return isTrue;
    }

    public static String changePi(String str) {
        if (str.length() <= 1) {
            return "";
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2, str.length()));
        } else {
            return str.charAt(0) + changePi(str.substring(1, str.length()));
        }
    }
     public int maxTriple(int[] nums) {
  int max=nums[0];
  if(max<nums[nums.length-1]){
    max=nums[nums.length-1];
  }
  if(max<nums[nums.length/2]){
    max=nums[nums.length/2];
  }
  return max;
}
public String lastChars(String a, String b) {
    //Very very bad code but it stills work
  if(a.length()>=1 &&b.length()>=1)
  return a.charAt(0)+""+b.charAt(b.length()-1);
  if(a.length()==0 &&b.length()==0)
  return "@@";
  if(a.length()==0 &&b.length()>=0)
  return "@"+b.charAt(b.length()-1);
  if(a.length()>=0 && b.length()==0){
    return a.charAt(0)+"@";
  }
  return "@@";
  
}
public boolean hasOne(int n) {
  String s=n+"";
  return s.contains("1");
}
public boolean only14(int[] nums) {
  boolean onlyone=true;
  for(int i=0;i<nums.length;i++){
    if(nums[i]!=1 &&nums[i]!=4){
      onlyone=false;
      break;
    }
  }
  return onlyone;
}
public boolean more14(int[] nums) {
  int nof1=0;
  int nof4=0;
  for(int i:nums){
    if(i==1){
      nof1++;
    }
    if(i==4){
      nof4++;
    }
  }
  return nof1>nof4;
}
public String stringTimes(String str, int n) {
  String str2=new String();
  for(int i=0;i<n;i++){
    str2+=str;
  }
  return str2;
}
    public int scoreUp(String[] key, String[] answers) {
  int len=key.length;
  int sum=0;
  for(int i=0;i<len;i++){
    if(answers[i].charAt(0)=='?' )continue;
    else if(answers[i].charAt(0)==key[i].charAt(0))sum+=4;
    else sum-=1;
  }
  return sum;
}

public int max1020(int a, int b) {
  if(a>20 &&b>20){return 0;}
  if(a>b &&a<=20){
    return a;
  }
  if(b>a && b<=20){
    return b;
  }
  return a;
}
public static boolean gHappy(String str) {
  ArrayList <Integer>list=new ArrayList<>();
  for(int i=0;i<str.length();i++){
    if('g'==str.charAt(i)){
      list.add(i);
    }
  }
 if(list.size()==1){
   return false;
 }
  for(int i=0;i<list.size()-1;i++){
      System.out.println(list.get(i)+"  "+list.get(i+1));
    int sum=Math.abs(list.get(i)-list.get(i+1));
    if(sum!=1){
      return false;
    }
  }
  return true;
}

public String repeatSeparator(String word, String sep, int count) {
  String temp=new String(word);
  if(count==1){
    return word;
  }
  if(count==0){
    return "";
  }
  for(int i=0;i<count-1;i++){
    word+=sep+temp;
  }
  return word;
}

    public static void main(String[] args) {
        //System.out.println("the sonuç "+count7(717));
        System.out.println("the sonuç " + count8(8818));
        String s = "ani";
        System.out.println(s.substring(0, 2));
        System.out.println(fibonacci(3));
        System.out.println("Fibo " + changePi("xpix"));
        String delsome = "delsome";
        delsome = delsome.replaceAll("del", "");
        System.out.println("Deneme " + delsome);
        int[] gayet = new int[4];
        int[] şayet = new int[4];
        String dolab = "Buralar";
        StringBuilder builder = new StringBuilder();
        builder.reverse();
        String str = "codign";
        int strlen = str.length();
        String last2 = str.substring(strlen - 2, strlen);
        System.out.println(last2);
        System.out.println(1 + 2 + "c"); //3c it is interesting
        //The expression is evaluted to left to write

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        String string = "animals";
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(3, 7)); //Bacause of final character
        System.out.println(string.substring(3, 7)); //_ cause to exception
        StringBuilder bul = new StringBuilder("start");
        StringBuilder nuhunankara = new StringBuilder(5);
        StringBuilder bul2 = bul.append("+middle"); //StringBuilder is mutable
        bul2.append("last");
        System.out.println(" " + bul.toString()); //Start+middle+last same object bul,bul2
        nuhunankara.append("hah");
        nuhunankara.length();
        nuhunankara.append(true);
        System.out.println(nuhunankara.toString());

        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);
        System.out.println(nuhunankara);
        int[] reference = new int[]{1, 2, 3}; //This is what it is
        int[] ananoymus = {1, 55, 66, 77};
        int idg[], integer;
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias));
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
//L is mean array
//İt is an object not string
        System.out.println(bugs[0].toString()); //This is as useless as life
//int[] vb is object
        System.out.println(Arrays.toString(bugs)); //Pythonesk [cricket, beetle, ladybug]
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE StringBuilder cant converted to this
        //objects[0] = new StringBuilder(); Array Store exception
        objects[0] = new String("Sen vaktinden çok sonra gelmiş gibi duruyorsun.");
        //objects[0]=new Integer(12); //Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
        //Object bile olsa çılgın gibi type syfe artadaş
        //int[] vars3[]; declares a 2d array
        boolean bul4 = Boolean.TRUE && Boolean.FALSE; //İt is just works
        System.out.println("Bul 4 is very importing in to much thing\t " + bul4);
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println(birds);//it is work well too
        //Birds.set is add but not append only make addition operation.
        //ArrayList equals method just like String equals method.
        String[] sennediyon = {"bir", "iki", "üç"};
        List<String> lise = Arrays.asList(sennediyon);
        lise.forEach(t -> System.out.println(t)); //it is just worked
        //lise.remove(1);//ead "main" java.lang.UnsupportedOperationException //
        //Because array has fixed length
        System.out.println("Mod işlemi olayları olayları " + -11 % 3); //Yanlıştır problemlidir
        Ackermann ack = new Ackermann();
        //System.out.println(ack.ackermannFunction(new BigInteger("4"),new BigInteger("1")));
        LocalDate mevzu2 = null;
        mevzu2 = LocalDate.of(1994, Month.APRIL, 4);
        System.out.println("Local date'in oflu kullanımı " + mevzu2);
        System.out.println("Bu da böyle ilginç\t" + mevzu2.plusMonths(2).plusYears(2).minusDays(333));
        LocalTime timeloc=LocalTime.now();
        System.out.println("Timeloca yazdırıldı\t"+timeloc);
        System.out.println("Local time" + LocalDateTime.now());
        System.out.println("Local date " + LocalDate.now());
        System.out.println("Local date " + LocalTime.now());
        System.out.println("İt is interesting " + Month.APRIL);
        System.out.println(Year.MIN_VALUE);
        System.out.println(Year.MAX_VALUE + "  " + Year.now() + " " + Year.isLeap(2015));
        Period wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(" wrong " + wrong);
        try {
            //System.out.println(ack.ackermannfunctioninteger(4,1));
            //System.out.println(ack.ackermannFunction(new BigInteger("4"),new BigInteger("2")));
            //System.out.println(ack.Ack(4,1));
        } catch (StackOverflowError e) {
            System.err.println("Error  " + e.toString());
            System.err.println("Error  " + e.getLocalizedMessage());
        }
        System.out.println("Sonraki mevzular");
        DateTimea.dateInfo();
        System.out.println("Böyle devam et\t"+"123".substring(0,2));
        int yirmisek=28;
        double diger=28/Recursion.bol;
        System.out.println(diger);
        System.out.println("Last airbender\n\n");
        System.out.println(gHappy("xxgggxygg"));
        String stirini="eylaaieae";
        stirini.lastIndexOf(str);
        stirini.indexOf(str);
        getSandwich("xxbreadyy");
    }

}
