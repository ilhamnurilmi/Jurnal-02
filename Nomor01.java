import java.util.Scanner;

public class Nomor01 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int n,hasil;
        System.out.print("N kuadrat =");
        n = UserInput.nextInt();
        hasil = n * n;
        System.out.println("Hasil =" +hasil);
	}
}