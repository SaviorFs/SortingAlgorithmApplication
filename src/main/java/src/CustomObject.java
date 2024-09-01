package src;

public class CustomObject implements Comparable<CustomObject> {
    private String name;
    private int key;
    private double value;

    // Constructor
    public CustomObject(String name, int key, double value) {
        this.name = name;
        this.key = key;
        this.value = value;
    }

    // Getter for 'key'
    public int getKey() {
        return key;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Getter for 'value'
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "name='" + name + '\'' +
                ", key=" + key +
                ", value=" + value +
                '}';
    }

    // Compare based on 'key' for sorting
    @Override
    public int compareTo(CustomObject other) {
        return Integer.compare(this.key, other.key);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CustomObject other = (CustomObject) obj;
        return key == other.key &&
               Double.compare(other.value, value) == 0 &&
               name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, key, value);
    }
}
