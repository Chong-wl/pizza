public class Slice_o_Heaven {
     public String storeAddress;

private String storemenu;
public String storeHours;
public long storePhoneNumber;
public String storeEmail;
public String storeWebsite;
public String pizaaname;
public String sides;
public String pizzaIngredients;
private String orderID;
private String orderDetails;
private String orderStatus;
private double orderTotal;
public void takeOrder(String id, String details, double total){
public SliceoHeaven(String storeName, String storehours, String storeEmail, String storePhonenumber) {
    this.storeName = storeName;
    this.storehoours = storehours;
    this.storeEmail = storeEmail;
    this.storePhonenumber = storePhonenumber;
    this.storeMenu = new HashMap<>();
    this.pizzaIngredients = new HashMap<>();
    this.sides = new HashMap<>();·
    this.drinks = new HashMap<>();
    this.orderID = 0;
    this.orderTotal = 0.0;
}
System.out.println("Order accepted!");

System.out.println("Order is being prepared");
try{
Thread.sleep(5000);
} catch (InterruptedException e){
System.out.println("Order is ready for pickup!");
}
System.out.println("Your order is ready!");

 }
public void makepizza(String id, String details, double total){
orderDetails = details;
orderTotal = total;
try{
 Thread.sleep(5000);
 } catch (InterruptedException e){
 System.out.println("Order is ready for pickup!");
System.out.println("Your pizza is ok!");

printReceipt();
 }
private void printReceipt(){
    System.out.println("\nReceipt for Slice-o-Heaven");
    System.out.println("Store Name: " + storeName);
    System.out.println("Store Address: " + storeAhours);
    System.out.println("Store Email: " + storeEmail);
    System.out.println("Store Phone: " + storePhonenumber);
    System.out.println("Order ID: " + orderID);
    System.out.println("Order Total: $" + orderTotal);
    System.out.println("Thank you for your order!");
}