package POO_Exemplo2.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValuelnStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + " , " + quantity + " units, Total: $ " + String.format("%.2f", totalValuelnStock());
    }
}
