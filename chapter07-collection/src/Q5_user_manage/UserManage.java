package Q5_user_manage;

import java.util.ArrayList;

/*
* 3 collection
* 3 object id, username, password
* use id to serach user
* exist return true
* not exist return false
* */
public class UserManage {
    private String name;
    private int id;
    private String password;
    private ArrayList<UserManage> list = new ArrayList<>();

    public UserManage() {
    }

    public UserManage(int id, String name, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<UserManage> getList() {
        return list;
    }

    public void setList(ArrayList<UserManage> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserManage{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password;
    }
}
