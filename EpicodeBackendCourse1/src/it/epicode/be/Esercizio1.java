package it.epicode.be;

public class Esercizio1 {
	
	public static void main(String[] args) {
		System.out.println("Esercizio 1");
		//Moltiplica
		int x = moltiplica(4, 5);
		System.out.print("molt: ");
		System.out.println(x);
		//Concatena
		String conc = concatena("String", 5);
		System.out.print("concat: ");
		System.out.println(conc);
		//Insert
		/*String[] arr = {"a", "b", "c", "d", "e"};*/
		String[] newArr = inserisci(new String[]{"a", "b", "c", "d", "e"}, "f");
		System.out.print("newArr: ");
		System.out.println(newArr[2]);
		
	}
	
	public static int moltiplica(int a, int b) {
		return a*b;
	}
	
	public static String concatena(String s, int n) {
		return s + n;
	}
	
	public static String[] inserisci(String[] arr, String s) {
		/*String[] res = new String[6];
		res[0] = arr[0];
		res[1] = arr[1];
		res[2] = s;
		res[3] = arr[2];
		res[4] = arr[3];
		res[5] = arr[4];*/
		String[] res = {arr[0], arr[1], s, arr[2], arr[3], arr[4]};
		
		return res;
	}

}
