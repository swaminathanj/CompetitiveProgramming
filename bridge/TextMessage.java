
public class TextMessage extends Message {
	 MessageSender messageSender;
	public TextMessage(MessageSender messageSender){
		this.messageSender=messageSender;
    }
   
    public void send(){
      messageSender.sendMessage();
    }

}
