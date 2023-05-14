import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			Elem[] listElem;
			System.out.println("How many elements?");
			int dim = in.nextInt();
			
			listElem = new Elem[dim];
			
			for(int i = 0; i < listElem.length; i++) {
				System.out.print("Name: ");
				String name = in.next();
			
				System.out.print("Descruitpion: ");
				String desc = in.next();
		
				System.out.print("Price:");
				int price = in.nextInt();
				
				listElem[i] = new Elem(name, desc, price);
			}
			
	
		}

	}

}
