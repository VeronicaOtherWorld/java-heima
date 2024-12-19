package Q6_stu_mgt;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class User {
    private String name;
    private String password;
    private String pwd2;
    private String ssn;
    private String phoneNumber;
    private String code;
    Scanner scanner = new Scanner(System.in);
    static char[] letterList = new char[52];
    static char[] digitList = new char[10];
    char[] codeList = new char[4];
    StringBuilder sb = new StringBuilder();
    public User() {
    }

    public User(String name, String password, String ssn, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }

    // 静态代码块初始化数组
    static {
        createLetterList();
    }

    // ====================register====================
    public void register(ArrayList<User> users) {
        boolean flag = false;
        boolean pwdFlag = false;
        boolean ssnFlag = false;
        boolean phoneNumberFlag = false;
        boolean uniqueNameFlag = true;
        // name
        while (!flag || uniqueNameFlag){
            System.out.println("enter your username");
            name = scanner.next();
            flag = validateName(name);
            if (!flag) { // 如果名字不合法，直接提示并继续循环
                System.out.println("Invalid username. Please try again.");
                continue;
            }
            // unique
            uniqueNameFlag = containName(users, name);
            if (uniqueNameFlag){
                System.out.println("username exist");
            } else {
                System.out.println("username not exist");
            }
        }

        // password
        while (!pwdFlag){
            System.out.println("enter your password");
            password = scanner.next();
            System.out.println("enter you password again");
            pwd2 = scanner.next();
            pwdFlag = validatePwd(password, pwd2);
            if (pwdFlag){
                System.out.println("right password");
            }
        }

        // ssn
        while (!ssnFlag) {
            System.out.println("enter your ssn");
            ssn = scanner.next();
            ssnFlag = validateSsn(ssn);
            if (ssnFlag){
                System.out.println("right ssn");
            }
        }

        // phone number
        while (!phoneNumberFlag){
            System.out.println("enter your phone number");
            phoneNumber = scanner.next();
            phoneNumberFlag = validatePhoneNumber(phoneNumber);
        }
        User user = new User(name, password, ssn, phoneNumber);
        users.add(user);
        System.out.println(users.toString());
        System.out.println("register success!!!");
    }

    // the name must have char and numbers, 3-15 length
    public boolean validateName(String name){
        int numCount = 0;
        int charCount = 0;
        // control length
        if ((name.length() < 3 || name.length() > 15)){
            return false;
        }
        //  control each one
        for (int i = 0; i < name.length(); i++){
            if ((name.charAt(i) >= '0' && name.charAt(i) <= '9')){
                numCount++;
            } else if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                    (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')){
                charCount++;
            } else {
                return false;
            }
        }
        // must have char, cannot be pure numbers
        if (charCount == 0 || numCount == 0){
            return false;
        }
        return true;
    }

    public boolean containName(ArrayList<User> users, String name){
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).name.equals(name)){
                return true;
            }
        }
        return false;
    }
    // register password
    public boolean validatePwd(String pwd1, String pwd2){
        if (pwd1.equals(pwd2)){
            return true;
        }
        return false;
    }
    // register ssn
    public boolean validateSsn(String ssn){
        // length 18
        if (ssn.length() != 18) {
            System.out.println("length");
            return false;
        }
        // cannot start with 0
        if (ssn.startsWith("0")) {
            return false;
        }

        // 1-17 must be number
        for (int i = 0; i < ssn.length() - 1; i++){
            if (ssn.charAt(i) <= '0' || ssn.charAt(i) > '9') {
                System.out.println("not number");
                return false;
            }
        }
        // 18 can be x X number
        if(ssn.charAt(17) != 'x' &&
                ssn.charAt(17) != 'X' &&
                ssn.charAt(17) < '0' && ssn.charAt(17) > '9'){
            System.out.println(ssn.charAt(17));
            System.out.println("last number");
            return false;
        }
        return true;
    }

    // phone number
    public boolean validatePhoneNumber(String phoneNumber){
        if (phoneNumber.length() != 11 || phoneNumber.charAt(0) == '0') {
            System.out.println("lenght");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++){
            if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
                System.out.println("each");
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", ssn='" + ssn + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    //  ====================login====================
    public boolean Login(ArrayList<User> users) {
        int userIndex;
        // if name exit
        boolean nameFlag = false;
        do {
            System.out.println("please enter your name");
            String enterName = scanner.next();
            userIndex = validateLoginName(users, enterName);
            if (userIndex == -1) {
                System.out.println("name is not exist, please register first");
                return false;
            }
            nameFlag = true;
        }while (!nameFlag);

        // code
        boolean flag = false;
        do {
            String code = createCode();
            System.out.println("please enter security code ( " + code + " ) :");
            String enterCode = scanner.next();
            flag = validateCode(code, enterCode);
        }while (!flag);

        // password
        boolean pwdFlag = false;
        int count = 0;
        do {
            System.out.println("please enter your password");
            String enterPwd = scanner.next();
            pwdFlag =validateLoginPwd(users, userIndex, enterPwd);
            count++;
            if (count >= 2) {
                System.out.println("you tried too many times, please try later");
                break;
            }
        } while (!pwdFlag);
        System.out.println("login success");
        return true;
    }

    public int validateLoginName(ArrayList<User> users, String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean validateCode(String code, String enterCode) {
        if (enterCode.equalsIgnoreCase(code)) {
            System.out.println("the code is correct");
            return true;
        } else {
            System.out.println("the code is not correct");
        }
        return false;
    }

    public boolean validateLoginPwd(ArrayList<User> users,int userIndex, String enterPwd) {
        String password = users.get(userIndex).getPassword();
        System.out.println(password);
        System.out.println(enterPwd);
        if (enterPwd.equals(password)) {
            System.out.println("the password is correct");
            return true;
        }
        return false;
    }
    // create the security code
    public static void createLetterList() {
        for (int i = 'a', j = 0; i >= 'a' && i <= 'z'; i++, j++) {
            letterList[j] = (char) i;
        }
        for (int i = 'A' , j= 26; i >= 'A' && i <= 'Z'; i++, j++) {
            letterList[j] = (char) i;
        }
        for (int i = '0', j= 0; i >= '0' && i <= '9'; i++, j++) {
            digitList[j] = (char) i;
        }
    }

    // =================reset================
    // validate name, not exist return
    // validate ssn and phone number
    //     same => ask user enter password, set
    //     not same => alert not match , failed
    public void retPassword (ArrayList<User> users){
        int userIndex;
        // name
        System.out.println("please enter your name");
        String enterName = scanner.next();
        userIndex = validateLoginName(users, enterName);
        if (userIndex == -1) {
            System.out.println("please register first");
            return;
        }
        // ssn
        System.out.println("please enter your ssn");
        String enterSsn = scanner.next();
        System.out.println("please enter your phone number");
        String enterPhoneNumber = scanner.next();
        if (!(enterPhoneNumber.equals(users.get(userIndex).getPhoneNumber()) &&
                enterSsn.equalsIgnoreCase(users.get(userIndex).getSsn()))) {
            System.out.println("not match, cannot reset password");
            return;
        }
        System.out.println("please enter your new password");
        String enterPwd = scanner.next();
        users.get(userIndex).setPassword(enterPwd);
        System.out.println("reset password success");

    }

    public String createCode(){
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(0, 52);
            codeList[i] = letterList[randomIndex];
        }
        int randomNum = random.nextInt(0, 10);
        codeList[3] = (char)(randomNum + '0');
        char temp;
        for (int i = 0; i < codeList.length; i++) {
            int ran = random.nextInt(0, 4);
            temp = codeList[i];
            codeList[i] = codeList[ran];
            codeList[ran] = temp;
        }
        code = new String(codeList);
        System.out.println(code);
        return code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
