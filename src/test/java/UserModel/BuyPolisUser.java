package UserModel;

public class BuyPolisUser {
    private final String modelAuto;
    private final String INN;
    private final String VIN;

    public String getModelAuto() {
        return modelAuto;
    }

    public String getINN() {
        return INN;
    }

    public String getVIN() {
        return VIN;
    }

    public BuyPolisUser(String modelAuto, String INN, String VIN) {
        this.modelAuto = modelAuto;
        this.INN = INN;
        this.VIN = VIN;
    }
}
