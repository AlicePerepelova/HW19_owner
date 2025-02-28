package test;

import config.OwnerWebConfigRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


  @BeforeAll
  public static void setUp() {
   new OwnerWebConfigRunner().setConfig();
  }

  @AfterEach
  public void afterEach() {

  }
}
