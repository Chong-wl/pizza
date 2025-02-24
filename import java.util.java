import java.util.HashMap;
import java.util.Map;
public class SliceoHeaven {
    private String storeName;
    private String storeAddress;
    private String storeEmail;
    private String storePhone;
    private Map<String, Double> storeMenu;
    private Map<String, Double> pizzaIngredients;
    private double pizzaPrice;
    private Map<String, Double> sides;
    private Map<String, Double> drinks;
    private int orderID;
    private double orderTotal;
    public SliceoHeaven(String storeName, String storeAddress, String storeEmail, String storePhone) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = new HashMap<>();
        this.pizzaIngredients = new HashMap<>();
        this.sides = new HashMap<>();·
        this.drinks = new HashMap<>();
        this.orderID = 0;
        this.orderTotal = 0.0;
    }
    public void takeOrder(Map<String, Integer> customerOrder) {
        orderID++;
        System.out.println("Order ID: " + orderID);
        for (Map.Entry<String, Integer> entry : customerOrder.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (storeMenu.containsKey(item)) {
                orderTotal += storeMenu.get(item) * quantity;
            } else if (sides.containsKey(item)) {
                orderTotal += sides.get(item) * quantity;
            } else if (drinks.containsKey(item)) {
                orderTotal += drinks.get(item) * quantity;
            } else {
                System.out.println("Item " + item + " not found in the menu.");
            }
        }
        System.out.println("Total for this order: $" + orderTotal);
    }
    public void makePizza(String pizzaSize, String[] pizzaIngredients) {
        switch (pizzaSize) {
            case "small":
                this.pizzaPrice = 10.0;
                break;
            case "medium":
                this.pizzaPrice = 15.0;
                break;
            case "large":
                this.pizzaPrice = 20.0;
                break;
            default:
                System.out.println("Invalid pizza size.");
                return;
        }
        for (String ingredient : pizzaIngredients) {
            if (this.pizzaIngredients.containsKey(ingredient)) {
                this.pizzaPrice += this.pizzaIngredients.get(ingredient);
            } else {
                System.out.println("Ingredient " + ingredient + " not available.");
                return;
            }
        }
        System.out.println("Making a " + pizzaSize + " pizza with ingredients: " + String.join(", ", pizzaIngredients));
        System.out.println("Price for this pizza: $" + this.pizzaPrice);
    }
    public void printReceipt() {
        System.out.println("\nReceipt for Slice-o-Heaven");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: $" + orderTotal);
        System.out.println("Thank you for your order!");
    }
