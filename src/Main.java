import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int sayi = input.nextInt();
		int basamakSayisi = 1;
		while(sayi>9) {
			basamakSayisi ++;
			sayi = sayi/10;
		}
		System.out.println(basamakSayisi);
		
		
		

	}

}
