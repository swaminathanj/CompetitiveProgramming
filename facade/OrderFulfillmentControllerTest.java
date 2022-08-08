public class OrderFulfillmentControllerTest {
 public static void main(String args[]) {
	 OrderFulfillmentController controller=new OrderFulfillmentController();
     controller.facade=new OrderServiceFacadeImpl();
     controller.orderProduct(9);
     boolean result=controller.orderFulfilled;
	 
 }
}
