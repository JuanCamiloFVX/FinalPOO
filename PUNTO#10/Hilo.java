public class Hilo extends Thread {

	private int N;
	private int Num;

	public Hilo(int N, int Num) {
		super();
		this.N = N;
		this.Num = Num;
	}

	public void run() {

		for (int i = 1; i <= N; i++) {

			System.out.println("El Carro # " + Num + " Avanzo " + i + " Metros");

		}

		System.out.println("El Carro # " + Num + "  A finalizo el recorrido");
	}

}