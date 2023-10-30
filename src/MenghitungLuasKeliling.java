import java.util.Scanner;

public class MenghitungLuasKeliling {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, luas, keliling;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextDouble();

        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}