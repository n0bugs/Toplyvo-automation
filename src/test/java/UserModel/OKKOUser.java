package UserModel;

public class OKKOUser {

    private final String name;
    private final String surname;
    private final String ValueLiters;
    private final String BirthDate;


    public OKKOUser(String name, String surname, String ValueLiters, String BirthDate) {
        this.name = name;
        this.surname = surname;
        this.ValueLiters = ValueLiters;
        this.BirthDate = BirthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getValueLiters(){
        return ValueLiters;
    }

    public String getBirthDate() {
        return BirthDate;
    }
}
