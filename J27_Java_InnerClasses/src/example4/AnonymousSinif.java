package example4;

public class AnonymousSinif {
	public static void main(String[] args) {
		Hayvan kedi = new Hayvan() {
			@Override
			void sesVer() {
				System.out.println("Miyav Miyav!");
			}
		};
		kedi.sesVer();
	}
}