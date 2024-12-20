package Q3_constructor;

public class Person {
    private String name;
    public Person() {
        // 默认调用本类其他方法
        this("pipi");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
