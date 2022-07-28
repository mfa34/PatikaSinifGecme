import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int avg , totallesson = 0 ,totalpoint = 0 ;


        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if(!(matematik <= 0 || matematik > 100)) {
            totalpoint += matematik;
            totallesson++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            totalpoint += fizik;
            totallesson++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            totalpoint += turkce;
            totallesson++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            totalpoint += kimya;
            totallesson++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            totalpoint += muzik;
            totallesson++;
        }

        avg = totalpoint / totallesson;


        if(avg <= 55) {
            System.out.println("Geçme durumu: Kaldınız, seneye görüşürüz!");
        } else {
            System.out.println("Geçme durumu: Geçtiniz, tebrik ederiz!");
        }

        System.out.println("Ortalamanız: " + avg);
    }
}
