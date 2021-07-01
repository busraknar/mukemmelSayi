import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi= input.nextInt();
        int bolen,toplam=0;
        for(int i=1;i<sayi; i++)
        {
            if(sayi%i==0) {
                bolen=i;
                toplam+=bolen;
            }
        }
        if(sayi==toplam)
            System.out.println(sayi+" sayısı mükemmel sayıdır.");
        else
            System.out.println(sayi+" sayısı mükemmel sayı değildir.");
    }
}
