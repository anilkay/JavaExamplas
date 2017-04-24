/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangularframe;

/**
 *
 * @author anilkaynar
 * https://adriann.github.io/programming_problems.html problem 19
 */
public class RectangularFrame {

  public static void print(String[]a){
        int loopParam=a.length;
        int max=1;
        for(int i=0;i<loopParam;i++){
          if(a[i].length()>max){
              max=a[i].length();
          }
        }
        for(int i=0;i<max+4;i++){
        System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<loopParam;i++){
            System.out.print("* "+a[i]+" ");
            for(int j=0;j<max-a[i].length();j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
         for(int i=0;i<max+4;i++){
        System.out.print("*");
        }
  }
    public static void main(String[] args) {
        String[] a={"Hello","Woruieieaeaulmikeld","Ladies"};
        print(a);
        System.out.println("\n\n Buil");
    }
    
}
