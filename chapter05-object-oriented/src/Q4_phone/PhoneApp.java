package Q4_phone;
/*
* has 3 phone
* */
public class PhoneApp {
    public static void main(String[] args) {
        double sum = 0;
        Phone[] phone = new Phone[4];
        phone[0] = new Phone("qq","red",888);
        phone[1] = new Phone("rr","blue",999);
        phone[2] = new Phone("ss","green",777);
        phone[3] = new Phone("aa","black",666);
        for (int i = 0; i < phone.length; i++) {
            sum += phone[i].getPrice();
        }
        double avg = sum/phone.length;
        System.out.println("average price: " + avg);
        for (int i = 0; i < phone.length; i++) {
            if(phone[i].getPrice() < avg) {
                System.out.println(phone[i].toString());
            }
        }

    }
}
