package CDonguler;
import java.util.Scanner;
public class Odev27SayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,i=0,enbuyuk=0,enkucuk=0;
        boolean ilkSayi=true;
        System.out.println("Kaç tane sayı gireceksiniz:");
        n= input.nextInt();
        while (i<n){
            i++;
            System.out.println(i+".Sayıyı giriniz");
            int sayi=input.nextInt();
            if(ilkSayi){
                enbuyuk=sayi;
                enkucuk=sayi;
                ilkSayi=false;
            }else{
                if(sayi>enbuyuk){
                    enbuyuk=sayi;
                }if (sayi<enkucuk){
                    enkucuk=sayi;
                }
            }
        }
        System.out.println("En büyük sayı:"+enbuyuk);
        System.out.println("En küçük sayı:"+enkucuk);
    }
}
