package Q6_phone_collection;

import java.util.ArrayList;

public class PhoneCollectionApp {
    public static void main(String[] args) {
        PhoneCollection pc1 = new PhoneCollection("rice", 1000);
        PhoneCollection pc2 = new PhoneCollection("apple", 8000);
        PhoneCollection pc3 = new PhoneCollection("hammer", 2999);
        ArrayList<PhoneCollection> phoneList = new ArrayList<>();
        phoneList.add(pc1);
        phoneList.add(pc2);
        phoneList.add(pc3);
        System.out.println(comparePhoneUnder3000(phoneList));
    }
    public static ArrayList<PhoneCollection> comparePhoneUnder3000(ArrayList<PhoneCollection> phoneList) {
        ArrayList<PhoneCollection> phoneList2 = new ArrayList<>();
        for (int i = 0; i < phoneList.size(); i++) {
            PhoneCollection pc = phoneList.get(i);
            if (phoneList.get(i).getPrice() < 3000) {
                phoneList2.add(pc);
            }
        }
        return phoneList2;
    }
}
