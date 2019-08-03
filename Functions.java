
package odev;
import java.util.Scanner;
public class Functions {
    static void fibonacci(){
       int x=1,y=1;
        System.out.print("1, 1, ");
       for (int i=0; i<18;i++){
           int temp;
           temp=y;
           y=x+y;
           x=temp;
        
           System.out.print(""+ y + ", ");
           
       } 
        //commenting here
    }
    static void palindrome(){
        System.out.print("Enter a String: ");
        String str=k.nextLine();
        for (int i=0, j=str.length()-1; i<j;i++, j--){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("it is not a palindrome");
                break;
            }
            if ( i == (j-1)|| i==j-2){
                System.out.println("it is a palindrome");
            }
        }
    }
    static void tersString(){
        System.out.println("Enter a String: ");
        String str=k.nextLine();
        int length= str.length();
        for(int i=length-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void enkucuk(){
        int enk , temp;
        System.out.println("10 sayı giriniz: ");
        enk=k.nextInt();
        for (int i=0; i<9;i++){
            temp = k.nextInt();
            if(temp<enk)
                enk=temp;
        }
        System.out.println("en küçük " + enk);
    }
    
    public static void ortalama(){
        int toplam=0;
        for (int i=0; i<5;i++){
            toplam=toplam+ k.nextInt();
        }
        System.out.println("ortalama : " + toplam/5.0);
        
    }
    public static void sifirNegatifPozitif(){
        int x, numNeg=0, numZero=0, numPoz=0;
        System.out.print("sayılar girin: ");
        for (int i=0; i<10;i++){
            x=k.nextInt();
            if(x<0)
                numNeg++;
            if(x==0)
                numZero++;
            if(x>0)
                numPoz++;
        }
        System.out.printf("negatives %d , zeros %d , pozitives %d \n ", numNeg, numZero, numPoz );
    }
    
   static void strInfo(){
        String str;
        System.out.print("Enter a String: ");
        str = k.nextLine(); 
        System.out.println("length is : " + str.length());
        int numberOfA=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a'){
                numberOfA++;
            }
        }
        System.out.println("number of 'a' : " +numberOfA);
         int numberOfaa = 0;
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)=='a'){
                if (str.charAt(i+1)=='a') {
                    numberOfaa++;
                    i++;
                }
                
            }
        }
        System.out.println("number of aa: " +numberOfaa);
        
        
         
   }
     static void ucKarakterSiralama(){
         char a=k.next().charAt(0),b=k.next().charAt(0),c=k.next().charAt(0); 
        char temp;
         System.out.println("üç karakter giriniz: ");
        if(c<b){
            temp=b;
            b=c;
            c=temp;
        }
        if(b<a){
            temp=b;
            b=a;
            a=temp;
        }
        if(c<b){
            temp=c;
            c=b;
            b=temp;
            
        }
        System.out.println(""+a + " "  +b+" "+c);
     }           
        
        
   static Scanner k = new Scanner(System.in);
    
}
