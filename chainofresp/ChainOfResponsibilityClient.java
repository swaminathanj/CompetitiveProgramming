public class ChainOfResponsibilityClient {
	 public static void main(String args[]){  
          Logger chainLogger= RequestorClient.doChaining();
  
              chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");  
              chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");  
              chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");  
              }

}
