import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;

        //kullanıcıdan tutar al
        Scanner input=new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        tutar= input.nextDouble();

        /*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        if (tutar > 0 && tutar <= 1000) {
            kdvOran = 0.18; // %18 KDV
        }else{
            kdvOran = 0.08; // %8 KDV
        }

        kdvTutar=tutar * kdvOran;
        kdvliTutar=kdvTutar+tutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Oranı: "+kdvOran);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.print("KDV'li Tutar: " +kdvliTutar);
    }
}