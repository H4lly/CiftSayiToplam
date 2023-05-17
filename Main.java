import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        int sayi;
        int toplam=0;
        do{
            System.out.print("Sayı giriniz:");
            sayi=scanner.nextInt();
            if((sayi%2==0) && (sayi%4==0)){
                toplam+=sayi;
            }
            sayi++;
        }while(sayi%2!=0);
        System.out.println("Toplam="+toplam);
    }
}