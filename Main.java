import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double vki,boy,kilo;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu metre cinsinde Giriniz: ");
        boy= inp.nextDouble();
        System.out.println("kilonuzu Giriniz: ");
        kilo= inp.nextDouble();
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz:"+vki);
    }
}