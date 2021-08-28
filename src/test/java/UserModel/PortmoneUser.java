package UserModel;

public class PortmoneUser {
    private final String cardNumberPortmone;
    private final String expiredDatePortmone;
    private final String cardCvvPortmone;

    public PortmoneUser(String cardNumberPortmone, String expiredDatePortmone, String cardCvvPortmone) {
        this.cardNumberPortmone = cardNumberPortmone;
        this.expiredDatePortmone = expiredDatePortmone;
        this.cardCvvPortmone = cardCvvPortmone;
    }

    public String getCardNumberPortmone() {
        return cardNumberPortmone;
    }

    public String getExpiredDatePortmone() {
        return expiredDatePortmone;
    }

    public String getCardCvvPortmone() {
        return cardCvvPortmone;
    }


}
