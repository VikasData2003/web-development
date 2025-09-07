
class SwiggyOld {

    void orderFood() {
        System.out.println("Ordering food from restaurant");
    }
}

class SwiggyNew extends SwiggyOld {

    void trackOrder() {
        System.out.println("Tracking your food delivery");
    }

    void instantDelivery() {
        System.out.println("Using Swiggy Instamart for instant delivery");
    }
}

public class SwiggyApp {

    public static void main(String[] args) {
        SwiggyNew obj = new SwiggyNew();
        obj.orderFood();
        obj.trackOrder();
        obj.instantDelivery();
    }
}
