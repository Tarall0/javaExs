public class Elem {
	private String nome;
	private String desc;
  private float price;
	
	public Elem(String nome, String desc, String price) {
		this.nome = nome;
    this.desc = desc;
    this.price = price;
	}
	
	public String getName(){
    return nome;
  }
}
