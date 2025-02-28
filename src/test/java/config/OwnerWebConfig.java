package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "classpath:configs/${env}.properties",
  "system:properties"
})
public interface OwnerWebConfig extends Config {
  @Key("Browser")
  @DefaultValue("edge")
  String getBrowser();

  @Key("BrowserVersion")
  String getBrowserVersion();

  @Key("BrowserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();

  @Key("RemoteUrl")
  @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
  String getRemoteUrl();

  @Key("BaseUrl")
  String getBaseUrl();
}
