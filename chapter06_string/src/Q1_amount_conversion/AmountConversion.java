package Q1_amount_conversion;

public class AmountConversion {
    private int amount;
    private String captionNum;

    public AmountConversion() {
    }

    public void convertCaptionNum(int amount) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        for (int i = 0; i < arr.length; i++) {
            if (amount == i) {
                captionNum = arr[i];
            }
        }
    }

    public String computeCaptionNum(String amount) {
        String[] unit = {"佰","拾","万","仟","佰","拾","元"};
        String newCaptionNum = "";
        for (int i = 0; i < unit.length; i++) {
            newCaptionNum += amount.charAt(i);
            newCaptionNum += unit[i];
        }
        return newCaptionNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCaptionNum() {
        return captionNum;
    }

    public void setCaptionNum(String captionNum) {
        this.captionNum = captionNum;
    }
}
