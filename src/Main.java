import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("İdman programına hoş geldiniz");

        String idmanlar= "Geçerli Hareketler...\n"
                +"Burpee\n"
                +"Pushup(Şınav)\n"
                +"Situp(Mekik)\n"
                +"Squat" ;


        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturunuz...");

        System.out.println("Burpee sayısı: ");
        int burpee= scan.nextInt();

        System.out.println("Pushup sayısı: ");
        int pushup= scan.nextInt();

        System.out.println("Situp sayısı: ");
        int situp= scan.nextInt();

        System.out.println("Squat sayısı: ");
        int squat= scan.nextInt();

        scan.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);
        System.out.println("İdmanınız başlıyor...");


        while(idman.idmanBittiMi() == false) {

            System.out.println("Hareket türü:(Burpee, Pushup, Situp, Squat)");
            String tur= scan.next();

            System.out.println("Bu hareketten kaç tane yapacaksınız?");
            int sayi= scan.nextInt();
            scan.nextLine();

            idman.harektYap(tur, sayi);

        }


        System.out.println("İdmanınızı başarıyla bitirdiniz :) ");
    }

}
