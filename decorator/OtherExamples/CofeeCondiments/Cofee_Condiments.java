
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;




public class Cofee_Condiments {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
	 public static void main(String args[]) {
		    
		    // our first beverage. 
		    Beverage beverage = new Espresso();
		    System.out.println(beverage.getDescription() + " $" + beverage.cost());

		    
		    // A second beverage with 2 mocha and whip
		    Beverage beverage2 = new Decaf();
		    beverage2 = new Milk(beverage2);
		    beverage2 = new Milk(beverage2);
		    beverage2 = new Sugar(beverage2);
		    
		    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		    
		    // A 3rd beverage with Soy Mocha and whip 
		    Beverage beverage3 = new HouseBlend();
		    beverage3 = new Soy(beverage3);
		    beverage3 = new Mocha(beverage3);
		    beverage3 = new Whip(beverage3);
		    
		    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		  }

}



class InputTest {
	public static void main(String[] args) throws IOException {
		int c;

		try {
			InputStream in = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class LowerCaseInputStream extends FilterInputStream {

	/**
	 * 
	 * @param in the inputStream to process 
	 */
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/**
	 * reads the input stream and convert
	 */
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	/**
	 * Read the byte array with an offset.
	 */
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}

abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}


abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}

class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}


class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}
class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}


class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}

class Sugar extends CondimentDecorator {
	Beverage beverage;

	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}

class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}