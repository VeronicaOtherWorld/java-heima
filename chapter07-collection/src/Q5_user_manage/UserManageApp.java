package Q5_user_manage;

import java.util.ArrayList;

/*
 * 3 collection
 * 3 object id, username, password
 * use id to serach user
 * exist return true
 * not exist return false
 * */
public class UserManageApp {
    public static void main(String[] args) {
        ArrayList<UserManage> userManageList = new ArrayList<>();
        UserManage um1 = new UserManage(1, "qq", "123456");
        UserManage um2 = new UserManage(2, "kiki", "223344");
        UserManage um3 = new UserManage(3, "opop", "445566");
        userManageList.add(um1);
        userManageList.add(um2);
        userManageList.add(um3);
        System.out.println(findUser(userManageList, 4));
    }


    public static boolean findUser(ArrayList<UserManage> list, int id) {
        int res = findUserIndex(list, id);
        if (res != -1) {
            return true;
        }
        return false;
    }
    public static int findUserIndex(ArrayList<UserManage> list, int id) {
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    index = i;
                    return index;
                }
            }
            return index;
    }
}
