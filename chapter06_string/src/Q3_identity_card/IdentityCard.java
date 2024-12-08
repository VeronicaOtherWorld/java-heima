package Q3_identity_card;

public class IdentityCard {
    private String cardNumber;
    private String BOD;
    private String gender;
    private String year;
    private String month;
    private String day;
    private char newGender;

    public IdentityCard() {
    }

    public IdentityCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void validateCardNumber(String cardNumber) {
        year = cardNumber.substring(6, 10);
        month = cardNumber.substring(10, 12);
        day = cardNumber.substring(12, 14);
        BOD = year + "-" + month + "-" + day;
        newGender = cardNumber.charAt(16);
        if ( newGender % 2 == 0) {
            gender = "female";
        } else {
            gender = "male";
        }
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", BOD='" + BOD + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBOD() {
        return BOD;
    }

    public void setBOD(String BOD) {
        this.BOD = BOD;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
