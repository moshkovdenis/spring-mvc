package web.model;

public class Car {
    private int id;
    private int series;
    private String name;

    public Car(int id, int series, String name) {
        this.id = id;
        this.series = series;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series=" + series +
                ", name='" + name + '\'' +
                '}';
    }
}
