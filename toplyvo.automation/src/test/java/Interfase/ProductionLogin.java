package Interfase;

import Pages.LoginPage;
import Helpers.SwitchServer;
public class ProductionLogin implements DoLoginInterfase{

    @Override
    public void dologin() {
        LoginPage atLoginPage = new LoginPage();
        atLoginPage.loginVariables3();
    }
}
