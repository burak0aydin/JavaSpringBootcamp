public class ProductManager {
    public void add(Product product) {
        //JDBC
        System.out.println("Ürün eklendi " + product.getName());
    }

    //Wrong vay
    public void add2(int id, String name, String discription, int stockAmount, double price) {

    }
}
