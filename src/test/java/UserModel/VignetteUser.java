package UserModel;

public class VignetteUser {
    private final String autoNumber;
    private final String nameSurname;
    private final String INN;

    public String getAutoNumber() {
        return autoNumber;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getINN() {
        return INN;
    }

    public VignetteUser(String autoNumber, String nameSurname, String INN) {
        this.autoNumber = autoNumber;
        this.nameSurname = nameSurname;
        this.INN = INN;
    }

}
