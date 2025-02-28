package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;


public class OwnerWebConfigRunner {
  static OwnerWebConfig config = ConfigFactory.create(OwnerWebConfig.class, System.getProperties());

  public void setConfig(){
    Configuration.pageLoadStrategy = "eager";
    Configuration.timeout = 7000;

    Configuration.browser = config.getBrowser();
    Configuration.browserVersion = config.getBrowserVersion();
    Configuration.browserSize = config.getBrowserSize();
    Configuration.remote = config.getRemoteUrl();
    Configuration.baseUrl = config.getBaseUrl();


  }
}
