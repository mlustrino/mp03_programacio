package introOO_AWS1;

public class TestStatic {
	public static void main(String[] args) {
		ClaseA clasea = new ClaseA();
		clasea.saludar();
		clasea.preguntar_hora();
		ClaseB claseb = new ClaseB();
		claseb.saludar();
		claseb.preguntar_hora();
//		ClaseA.preguntar_hora();
	}

}

class ClaseA{
	public static void saludar() {
		System.out.println("Holas");
	}
	public static void preguntar_hora() {
		System.out.println("que hora es");
	}
}


class ClaseB extends ClaseA{
	public static void saludar() {
		System.out.println("Holas");
	}
	public static void preguntar_hora() {
		System.out.println("que hora es LOLOLOLO");
	}
}
