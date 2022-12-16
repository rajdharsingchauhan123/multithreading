package OptionalEx;

public class Car {
    private String name;
    private int id;
    private  String model_name;
    private String colour;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getModel_name() {
        return model_name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", model_name='" + model_name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
public Car(){}
    public Car(String name, int id, String model_name, String colour) {
        this.name = name;
        this.id = id;
        this.model_name = model_name;
        this.colour = colour;
    }
}
