package Interfase;

import Pages.AuthorizationPages.LoginPage;

public class ProductionLogin implements DoLoginInterfase{

    @Override
    public void dologin() {
        LoginPage atLoginPage = new LoginPage();
        atLoginPage.loginVariables3();
    }
}
