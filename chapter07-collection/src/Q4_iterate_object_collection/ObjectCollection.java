package Q4_iterate_object_collection;

public class ObjectCollection {
    private String name;
    private int age;

    public ObjectCollection() {
    }

    public ObjectCollection(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectCollection{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
