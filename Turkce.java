/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkce;

/**
 *
 * @author anilkaynar
 */
public class Turkce {
public static String[] SplitTurk(String article){
    String[] presplit= article.split(" ");
    
    String[] npresplit=new String[presplit.length];
    for(int i=0;i<presplit.length;i++) {
           npresplit[i]=punctuationRemover(presplit[i]);
    }
return npresplit;
} 
private static String punctuationRemover(String withPunctuation) {
    int k=1;
    int o=0;
    for(int i=0;i<10;i++) {
        StringBuilder builder=new StringBuilder();
        withPunctuation=withPunctuation.trim();
       boolean withp=false;
    if(withPunctuation.endsWith(".")||withPunctuation.endsWith(",")
            ||withPunctuation.endsWith(";")|| withPunctuation.endsWith("?")
            ||withPunctuation.endsWith("!")||withPunctuation.endsWith(":")||withPunctuation.endsWith("'")
            ||withPunctuation.endsWith("\"")) {
        withp=true;
        for( o=0;o<withPunctuation.length()-1;o++) {
            builder.append(withPunctuation.charAt(o));
        }
        builder.append(" ");
    }
    else if(withPunctuation.startsWith(".")||withPunctuation.startsWith(",")
            ||withPunctuation.startsWith(";")||withPunctuation.startsWith("?")
            ||withPunctuation.startsWith("!")||withPunctuation.startsWith(":")||withPunctuation.startsWith("'")
              ||withPunctuation.endsWith("\"")
             ) {
          withp=true;
        for( k=1;k<withPunctuation.length();k++) {
            builder.append(withPunctuation.charAt(k));
        }
        builder.append(" ");
    } if(withp) {
     withPunctuation=builder.toString();
    }
     builder=null;
     k=1;
     o=0;
    }
        
       return withPunctuation;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String deneme="Deneme.";
        if(deneme.endsWith(".")){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<deneme.length()-1;i++) {
           builder.append(deneme.charAt(i));
        }
        builder.append(" ");
        String post=builder.toString();
        post=post.trim();
        System.out.println(post);
        }
        String burada="Bu sembolik karakteri  biliyorduk. " +
"" +
"Ama “İplemeyen”, “Takmayan”, “Koyver gitsin” diyen dördüncü maymun. " +
"İşte o yeni icat edildi. " +
"" +
"Bir tarafta “Hayır” diyene “Hain”, “Terörist” diye saydıran. " +
"Öteki tarafta “Evet” diyene “Satılmış”, “Faşist” damgası yapıştıran. " +
"Ancak bu kelimeleri dinlemeye zorlanan kulaklar..." +
"Ancak bir tarafı görmeye izin verilen gözler" +
"İki tarafta da sessiz, ürkek bir dördüncü maymun sembolü yaratıyor. " +
"" +
"Duymak istediğimi dinleyemeyeceksem, görmek istediğimi seyredemeyeceksem, demek istediğimi söyleyemeyeceksem. " +
"Ne yapayım ben bu kulağı, bu gözü Ya şu bir türlü uzayamayan, kısalamayan dilim." +
"Onu ne yapayım " +
"" +
"Semboller dünyamızda, 3 maymun yeterince kalabalık yapıyordu, dördüncü de gelince izdiham başladı. " +
"" +
"Bilelim ki, üç maymunu oynayanın da, bir dördüncüsünün de ne evetçiye hayrı olur, ne de hayırcıya. " +
"" +
"O yüzden gelin en iyisi demokratik 21’inci yüzyıl insanına yakışır bir  yapalım. " +
"" +
"Üç maymunu oynayanlara, bir de dördüncüyü ekleyip referandumun üzerine daha şimdiden tartışma tozları dökmeyelim. ";
        for(String s:SplitTurk(burada)) {
       System.out.println(s);
        }
    }
    
}
