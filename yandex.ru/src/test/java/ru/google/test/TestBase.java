package ru.google.test;

import org.testng.annotations.BeforeMethod;
import ru.google.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  public ApplicationManager getApp() {
    return app;
  }
}
