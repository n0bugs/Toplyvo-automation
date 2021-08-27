package UserModel;

public class UserHaveBankCard {
    private final String cardNumber;
    private final String cardDate;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardDate() {
        return cardDate;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    private final String cardCVV;

    public UserHaveBankCard(String cardNumber, String cardDate, String cardCVV) {
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCVV = cardCVV;
    }
}
