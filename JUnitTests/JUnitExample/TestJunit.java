package JUnitExample;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   String emptymsg = "";
   // the biggest string will be 1KB
   int MAX_STRING_LEN = 1024;
  
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {	  
	   assertEquals(message, messageUtil.printMessage());
   }
   	
   @Test
   public void testPrintEmptyMessage() {	
	    MessageUtil emptymsgUtil = new MessageUtil(emptymsg);
	    assertEquals(emptymsg, emptymsgUtil.printMessage());
   }
   
   
   @Test
   public void testPrintBigMessage() {
	   // the maximum length of String in java is 2147483647
	   String bigmsg = "";
	   for (int i=0; i<MAX_STRING_LEN;i++)
		   bigmsg = bigmsg + "a";
	   MessageUtil bigmsgUtil = new MessageUtil(bigmsg);
	   assertEquals(bigmsg, bigmsgUtil.printMessage());
   }
}