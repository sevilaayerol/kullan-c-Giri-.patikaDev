import java.util.Scanner;

public class kullaniciGiris {

	public static void main(String[] args) {
		String userName, password, cevap;

		Scanner input = new Scanner(System.in);
		System.out.println("Kullan�c� ad� giriniz:");
		userName = input.nextLine();

		System.out.println("�ifre giriniz:");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Kullan�c� giri�i ba�ar�l�.");
		} else {
			System.out.println("�ifre hatal�.\n�ifrenizi s�f�rlamak ister misiniz ? (evet/hay�r)");
			cevap = input.nextLine();
			if (cevap.equals("evet")) {
				System.out.println("Yeni �ifre olu�turunuz: ");
				password = input.nextLine();
				if (password.equals("java123")) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					password=input.nextLine();
					System.out.println("�ifre olu�turuldu, giri� ba�ar�l�!");

				} else {
					System.out.println("�ifre olu�turuldu, giri� yapabilirsiniz.");
					
				}

			}
			
			}
		}

	}


