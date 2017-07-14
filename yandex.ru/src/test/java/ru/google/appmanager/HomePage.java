package ru.google.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
  //Описываем элементы на странице

    //Поле Логин
    public SelenideElement fieldLogin() {
      return $(By.xpath("//input[@name='login']"));
    }

    //Поле Пароль
  public SelenideElement fieldPass() {
    return $(By.xpath("//input[@name='passwd']"));
  }


  //Методы
  public MailPage successfulAuthorization(String login, String pass) {
      fieldLogin().setValue(login);
      fieldPass().setValue(pass).pressEnter();
      return new MailPage();
  }
}
