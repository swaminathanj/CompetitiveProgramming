public class MailClientVisitorTest {
	public static void main(String args[]) {
		    MacMailClientVisitor macVisitor;
		    LinuxMailClientVisitor linuxVisitor;
		    WindowsMailClientVisitor windowsVisitor;
		    OperaMailClient operaMailClient;
		    SquirrelMailClient squirrelMailClient;
		    ZimbraMailClient zimbraMailClient;
		   
		 
		    macVisitor=new MacMailClientVisitor();
		    linuxVisitor=new  LinuxMailClientVisitor();
		    windowsVisitor=new WindowsMailClientVisitor();
		    operaMailClient = new OperaMailClient();
		    squirrelMailClient=new SquirrelMailClient();
		    zimbraMailClient=new ZimbraMailClient();
		    
		   
		     
		        System.out.println("-----Testing Opera Mail Client for different environments-----");
		        operaMailClient.accept(macVisitor);
		        operaMailClient.accept(linuxVisitor);
		        operaMailClient.accept(windowsVisitor);
		    
		 
		        System.out.println("\n-----Testing Squirrel Mail Client for different environments-----");
		         squirrelMailClient.accept(macVisitor);
		         squirrelMailClient.accept(linuxVisitor);
		         squirrelMailClient.accept(windowsVisitor);
		
		        System.out.println("\n-----Testing Zimbra Mail Client for different environments-----");
		        zimbraMailClient.accept(macVisitor);
		        zimbraMailClient.accept(linuxVisitor);
		        zimbraMailClient.accept(windowsVisitor);
		    }
	}


