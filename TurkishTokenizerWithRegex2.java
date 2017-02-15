/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turkce;

import java.util.StringTokenizer;

/**
 *
 * @author anilkaynar
 */
public class TurkishTokenizerWithRegex2 {
    public static void main(String[] args) {
        String article="" +
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
      //StringTokenizer token= new StringTokenizer(article," ");
      
        //      while (token.hasMoreTokens()) {
          //  String nextElement = (String) token.nextToken();
            //System.out.println(nextElement);
           //article=article.replace('ç','c');
            //article=article.replace('ö','o');
             //article=article.replace('ü','u');
             //article=article.replace('ş','s');
                String[] words = article.replaceAll("[^a-zA-Z-ğüşöçİĞÜŞÖÇ\\s]+", "").toLowerCase().split("\\s+");
                /*Work fine
                */
                for(String s:words) {
                    System.out.println(s);
                }
      //  }
    }
}
