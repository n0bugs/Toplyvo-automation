package Interfase;

import Pages.AutorizePage.LoginPage;

public class ProductionLogin implements DoLoginInterfase{

    @Override
    public void dologin() {
        LoginPage atLoginPage = new LoginPage();
        atLoginPage.loginVariables3();
    }
}
