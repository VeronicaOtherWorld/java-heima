package Q4_objectApi;

public class User {
    private int id;
    private String name;
    private int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // 同一个对象
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // 类型不同或 null
        }

        User user = (User) obj;

        return this.id == user.id &&
                this.age == user.age &&
                (this.name == null ? user.name == null : this.name.equals(user.name));
    }
}
