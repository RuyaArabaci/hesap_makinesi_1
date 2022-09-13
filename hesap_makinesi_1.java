package kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class hesap_makinesi_1 {
    public static void main(String[] args) {
        double a,b;
        int symbol;
        Scanner input = new Scanner(System.in);
        
        System.out.print("a sayısını giriniz: ");
        a = input.nextDouble();
        System.out.print("b sayısını giriniz: ");
        b = input.nextDouble();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yukardaki işlemlerden birini seçerek numarasını yazınız: ");
        symbol = input.nextInt();

        switch (symbol) {
            case 1: 
                System.out.println("Sonuç: " + a+b);
                break;
            case 2:
                System.out.println("Sonuç: " + (a-b));
                break;
            case 3:
                System.out.println("Sonuç: " + a*b);
                break;
            case 4:
                System.out.println("Sonuç: " + a/b);
                break;
            default:
                System.out.println("Girilen sembol geçerli değil!");
        }
        
    }
    
}
