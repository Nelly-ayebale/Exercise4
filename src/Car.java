public class Car {
    private String model,brand,color;
    private int year,price,quantity;

    public Car(String model, String brand,int year,int price,String color,int quantity){
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }
    public void delivery(int c){
        quantity +=c;
    }
    public void sell(int c){
        quantity -=c;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class CarDemo{
    public static void main(String[] args) {
        Car car = new Car("GLE","Benz",2020,10000,"maroon",10);
        System.out.println(car.toString());
        car.sell(3);
        System.out.println(car.getColor());
        int year = car.getYear();
        car.setColor("black");
        System.out.println(car.toString());
    }
}
