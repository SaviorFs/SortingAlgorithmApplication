package src;

public class CustomObject implements Comparable<CustomObject> {
    private String name;
    private int key;
    private double value;

    public CustomObject(String name, int key, double value) {
        this.name = name;
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "name='" + name + '\'' +
                ", key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(CustomObject other) {
        return Integer.compare(this.key, other.key);
    }
}
