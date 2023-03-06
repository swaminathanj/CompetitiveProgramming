
public class Tax_Visitor {

	public static void main(String[] args)
	{
		Milk milk = new Milk(50);
		Pizza mgw = new Pizza(270);
		OtherStuff youKnow = new OtherStuff(100);
		
		Visitor visitor = new TaxCalculator();
		milk.acceptVisitor(visitor);
		mgw.acceptVisitor(visitor);
		youKnow.acceptVisitor(visitor);
	}
}
class Milk implements Visitable{

	private int price;
	
	public Milk(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visit(this);
	}

}
class OtherStuff implements Visitable{

	private int price;
	
	public OtherStuff(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		
		visitor.visit(this);
	}

}

class Pizza implements Visitable{
	
	private int price;
	
	public Pizza(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		
		visitor.visit(this);
	}

}
class TaxCalculator implements Visitor{

	@Override
	public void visit(Milk milk) {
		System.out.println("Price of milk with tax is "+(milk.getPrice()+11));
		
	}

	@Override
	public void visit(Pizza pizza) {
		System.out.println("Price of pizza with tax is "+(pizza.getPrice()+pizza.getPrice()));
	}

	public void visit(OtherStuff stuff) {
		System.out.println("Price of other Stuff with tax is "+(stuff.getPrice()));
	   //No tax
	}

}
interface Visitable {

	public void acceptVisitor(Visitor visitor);
	
}

interface Visitor {

	public void visit(Milk milk);
	
	public void visit(Pizza pizza);
	
	public void visit(OtherStuff stuff);
	
}