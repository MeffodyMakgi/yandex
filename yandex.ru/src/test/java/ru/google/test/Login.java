package ru.google.test;

import org.testng.annotations.Test;
import ru.google.appmanager.HomePage;
import ru.google.appmanager.MailPage;

public class Login extends TestBase {

  @Test
  public void loginForYandex() {
    HomePage home = new HomePage();
    MailPage mailPage = home.successfulAuthorization("selenidetestjava", "123581321");
  }
}
