public class Product {
    private  String name;
    private  String description;
    private  float price;
    private  int quantity;
    private  float discount;
    private String color; //when modified and add any  data members "it's became to all object from this class"

    //default constructor includes when never make any constructor only
    public Product(){
        this.name = "Null";
        this.description = "Null";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0.0f;
        this.color = "Null";
    } //by default by java if don't use any constructor
    public Product(String name,String description,float price,int quantity,float discount){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    public Product(String name,String description,float price,int quantity,float discount,String color){
        this(name,description,price,quantity,discount);
        this.color = color;
    }

    public Product(String name,String description,float price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(Product object){
        this(object.name,object.description,object.price,object.quantity,object.discount,object.color);
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", color= "+ color +
                '}';
    }//don't forget use sout statement

   // other way to print
//    public void display(){
//        System.out.println("Name= "+name);
//        System.out.println("description= "+description);
//        System.out.println("price= "+price);
//        System.out.println("quantity= "+quantity);
//        System.out.println("discount= "+discount);
//        System.out.println("color= "+color);
//    }

    //to modified any value after enter it (use setter and getter)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
