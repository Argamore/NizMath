package nizmath;

public class Background {
	// Metoda za ispisivanje najmanjeg broja u nizu
	public static void najmanji(int[] niz) {
		int najmanji = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < najmanji) {
				najmanji = niz[i];
			}
		}
		System.out.println("Najmanji broj u nizu je: " + najmanji);
	}

	// Metoda za ispisivanje najveceg broja u nizu
	public static void najveci(int[] niz) {
		int najveci = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > najveci) {
				najveci = niz[i];
			}
		}
		System.out.println("Najveci broj u nizu je: " + najveci);
	}

	// Metoda za ispisivanje zbira niza

	public static void zbir(int[] niz){
		double suma =0;
		for (int i=0; i<niz.length;i++){
			suma+=niz[i];
		}
		System.out.println("Zbir niza je : " + suma);
	}
	// Metoda za ispisivanje prosjeka brojeva niza
	public static void prosjek(int[] niz) {
		double suma = 0;
		for (int i = 0; i < niz.length; i++) {
			suma += niz[i];
		}
		System.out.println("Prosjek niza je: " + suma / niz.length);

	}

	// Metoda za ispisivanje unikatnih brojeva u nizu
	public static void unikatni(int[] niz) {

	}

	// Metoda za sortiranje niza od najmanjeg ka najvecem broja
	public static void sortiranje(int[] niz) {

	}
}
