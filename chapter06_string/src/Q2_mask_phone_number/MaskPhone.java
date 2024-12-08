package Q2_mask_phone_number;

public class MaskPhone {
    private String number;
    private String startNum;
    private String endNum;

    public MaskPhone() {
    }
    public String maskPhone(String number) {
        startNum = number.substring(0, 4);
        endNum = number.substring(7);
        number = startNum + "****" +endNum;
        return number;
    }
}
