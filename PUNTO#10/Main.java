import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dijite la distancia que recorrera el Carro # 1");

		int N1 = scanner.nextInt();

		System.out.println("Dijite la distancia que recorrera el Carro # 2");
		int N2 = scanner.nextInt();

		System.out.println("Dijite la distancia que recorrera el Carro # 3");
		int N3 = scanner.nextInt();

		Hilo Hilo_1 = new Hilo(N1, 1);
		Hilo Hilo_2 = new Hilo(N2, 2);
		Hilo Hilo_3 = new Hilo(N3, 3);
		Hilo_1.start();
		Hilo_2.start();
		Hilo_3.start();

	}

}