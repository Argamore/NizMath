package nizmath;

public class App {

	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			System.out.print("Unesite 10 brojeva u niz: ");
			int[] niz = new int[10];
			for (int i = 0; i < niz.length; i++){
				niz[i] = unos.nextInt();
			}
			Background.najmanji(niz);
			Background.najveci(niz);
			Background.zbir(niz);
			Background.prosjek(niz);
			Background.unikatni(niz);
			Background.sortiranje(niz);
		}
		catch (Exception e){
			System.err.println("Error! Check input!");
		}
	}

}
