
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Camera","Auto....",99,10,5);
        System.out.println(p1.toString());
        System.out.println("--------------");
        Product p2 = new Product("pen","write..",10);
        System.out.println(p2.toString());
        System.out.println("--------------");
        p1.setPrice(50); //updata price of p1
        Product p3 = new Product(p1);
        System.out.println(p3.toString());
        System.out.println("--------------");


    }
}