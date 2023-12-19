package Diziler;

import java.util.Scanner;

public class NewClassMetod {
    private static void toplama(double num1,double num2){
        System.out.print("SONUÇ :" + (num1+num2)+"\n");
    }
private static void cıkarma(double num1,double num2){
    System.out.print("SONUÇ :" + (num1-num2)+"\n");
}
private static void carpma(double num1,double num2){
    System.out.print("SONUÇ :" +(num1*num2)+"\n");
}
    private static void bolme(double num1 , double num2){
        System.out.print("SONUÇ :" +(num1/num2)+"\n");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nÇarpım Taplosu ");

        while (true){
            System.out.println("\nSeçim yapınız !");
            System.out.println("1.Toplama  işlemi ");
            System.out.println("2.Çıkarma işlemi ");
            System.out.println("3.Çarpma işlemi");
            System.out.println("4.Bölme işlemi ");
            System.out.println("5.Exit.");

            System.out.print("Seçimi giriniz :");
            int seçim =scan.nextInt();

            if (seçim==5){
                System.out.println("Sistemden çıkıyorsunuz.İyi Günler...");
                break;
            }else {
                System.out.print("1.Sayıyı giriniz :");
                double num1=scan.nextDouble();
                System.out.print("2.Sayıyı giriniz :");
                double num2=scan.nextDouble();

                switch (seçim){
                    case 1:
                        toplama(num1,num2);
                        break;
                    case 2 :
                        cıkarma(num1,num2);
                    case 3 :
                        carpma(num1,num2);
                    case 4 :
                        bolme(num1,num2);
                    default:
                        System.out.println("Hatalı giriş yapıldı !.");
                }
            }









        }






    }
}
