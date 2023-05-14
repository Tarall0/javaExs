import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			Prodotto[] elencoProdotti;
			System.out.println("Inserisci il n di prodotti");
			int dim = in.nextInt();
			
			elencoProdotti = new Prodotto[dim];
			
			for(int i = 0; i < elencoProdotti.length; i++) {
				System.out.print("ID: ");
				int id = in.nextInt();
			
				System.out.print("Descrizione: ");
				String desc = in.next();
		
				System.out.print("Price:");
				int price = in.nextInt();
				
				elencoProdotti[i] = new Prodotto(id, desc, price);
			}
			
			for(int i = 0; i < elencoProdotti.length; i++) {
				System.out.println("CDE:"+elencoProdotti[i].getId()+" Descrizione: "+elencoProdotti[i].getDesc()+" Prezzo: "+elencoProdotti[i].getPrezzo());
			}
		}

	}

}
