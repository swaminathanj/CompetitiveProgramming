
public class Adapter_CharReader {

	public static void main(String[] args)
	{
		CharReaderAPI reader=new CharReaderAPI(new MyCharReader());
		reader.readAllChars("rohit");
      
		ThirdPartyCharReader wooohReader=new ThirdPartyCharReader();//Not Supported
	
		ReaderAdapter adapter=new ReaderAdapter(wooohReader);//Unsupported Object wrapped in Adapter
		
		reader=new CharReaderAPI(adapter);
		
		reader.readAllChars("Singh");
	}
	
}
class CharReaderAPI {

	Reader reader;
	
	public CharReaderAPI(Reader reader)
	{
		this.reader=reader;
	}
	
	public void readAllChars(String name)
	{
		reader.printAllCharacters(name);
	}
	
	
}
class MyCharReader implements Reader{
	
	@Override
	public void printAllCharacters(String arr)
	{
		for(int i=0;i<arr.length();i++)
		{
		  System.out.println("char["+i+"]= "+arr.charAt(i));
		}
	}
}
interface Reader {

	public void printAllCharacters(String arr);
	
}

class ReaderAdapter implements Reader{

	private ThirdPartyCharReader thirdPartyReader;
	
	public ReaderAdapter(ThirdPartyCharReader thirdPartyReader) {
		
		this.thirdPartyReader=thirdPartyReader;
	}
	
	
	@Override
	public void printAllCharacters(String arr) {
		
		thirdPartyReader.takeInput(arr);
		thirdPartyReader.ChangeToCharArray(arr);
		thirdPartyReader.display();
	}

}
class ThirdPartyCharReader {

    private char[] charArray;
    
    
	public void takeInput(String input)
	{
		charArray=ChangeToCharArray(input);
	}
	
	public char[] ChangeToCharArray(String input)
	{
		return input.toCharArray();
	}
	
	public void display()
	{
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("char["+i+"]= "+charArray[i]);
		}
	}
}