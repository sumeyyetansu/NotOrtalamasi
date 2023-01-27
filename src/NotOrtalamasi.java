import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args){

        int matematik, fizik, kimya, türkçe, tarih, müzik ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        matematik = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        türkçe = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        müzik = inp.nextInt();

        int toplam = (matematik + fizik + kimya + türkçe + tarih + müzik) ;

        double ortalama =  toplam / 6 ;


        System.out.println("Not ortalamanız: " + ortalama);

        System.out.println(ortalama > 60? "Sınıfı geçti" : "sınıfta kaldı");











    }
}
