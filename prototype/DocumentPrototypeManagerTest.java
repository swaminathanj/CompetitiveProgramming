
public class DocumentPrototypeManagerTest {
	    public static void main(String args[]){
	        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
	        clonedTAndC.setVendorName("Mary Parker");
	        System.out.println(clonedTAndC);
	        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
	        clonedNDA.setVendorName("Patrick Smith");
	        System.out.println(clonedNDA);
	    }

}
