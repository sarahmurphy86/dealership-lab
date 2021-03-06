public abstract class Vehicle {
    private double price;
    private String colour;
    private Engine engine;

    public Vehicle(double price, String colour, Engine engine){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public String turnOnEngine(){
        return this.engine.rev();
    }
}
