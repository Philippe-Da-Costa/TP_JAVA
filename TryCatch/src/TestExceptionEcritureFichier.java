import java.io.FileOutputStream;
import java.util.Scanner;

public class TestExceptionEcritureFichier {
	public static void method3() {
		System.out.println("BEGIN method3");
		while (true) {
			try {
				FileOutputStream fos = new FileOutputStream("save.data");
				fos.write("ok\n".getBytes());
				fos.close();
				break;
			} catch (Exception e) {
				System.out.println("probleme d ecriture. Desirez vous recommencer ?");
				Scanner sc = new Scanner(System.in);
				String response = sc.nextLine().trim();
				if (response.equalsIgnoreCase("non")) {
					break;
				}
			}
		}
	}

	public static void method2() {
		System.out.println("BEGIN method2");
		method3();
		System.out.println("END method2");
	}

	public static void method1() {
		System.out.println("BEGIN method1");
		method2();
		System.out.println("END method1");
	}

	public static void main(String[] args) {
		System.out.println("BEGIN main");
		method1();
		// L execution du programme continue et affichera la suite .
		// pour l exemple "END main" s affichera
		System.out.println("END main");
	}
}
