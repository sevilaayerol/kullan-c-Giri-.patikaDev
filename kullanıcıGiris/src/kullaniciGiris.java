import java.util.Scanner;

public class kullaniciGiris {

	public static void main(String[] args) {
		String userName, password, cevap;

		Scanner input = new Scanner(System.in);
		System.out.println("Kullanýcý adý giriniz:");
		userName = input.nextLine();

		System.out.println("Þifre giriniz:");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Kullanýcý giriþi baþarýlý.");
		} else {
			System.out.println("Þifre hatalý.\nÞifrenizi sýfýrlamak ister misiniz ? (evet/hayýr)");
			cevap = input.nextLine();
			if (cevap.equals("evet")) {
				System.out.println("Yeni þifre oluþturunuz: ");
				password = input.nextLine();
				if (password.equals("java123")) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
					password=input.nextLine();
					System.out.println("Þifre oluþturuldu, giriþ baþarýlý!");

				} else {
					System.out.println("Þifre oluþturuldu, giriþ yapabilirsiniz.");
					
				}

			}
			
			}
		}

	}


