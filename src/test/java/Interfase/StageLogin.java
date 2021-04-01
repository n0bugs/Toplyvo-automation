package Interfase;

import Pages.AuthorizationPages.LoginPage;

public class StageLogin implements DoLoginInterfase{

    @Override
    public void dologin() {
        LoginPage atLoginPage = new LoginPage();
        atLoginPage.loginVariables1();
        System.out.println("stage");

    }
}
