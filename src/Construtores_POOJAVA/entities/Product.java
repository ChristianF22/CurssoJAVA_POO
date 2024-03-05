package Construtores_POOJAVA.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
     
    //Mandendo um construtor padrão
    public Product(){
    }
    //Utilizando o construtor em Java
    public Product(String name, double price, int quantity){
       this.name = name;
       this.price = price;
       this.quantity = quantity;
    }

    //Criando um segundo construtor fazendo uma sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    } 

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String toString() {
    return name + ", $ "  + String.format("%.2f", price) + ", "  + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
    public double getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
