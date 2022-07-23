public class EmailMessage extends Message{
	 MessageSender messageSender;
    public EmailMessage(MessageSender messageSender){
    	this.messageSender=messageSender;
    }
    public void send(){
        messageSender.sendMessage();
    }
}