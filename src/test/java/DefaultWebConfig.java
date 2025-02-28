import org.aeonbits.owner.Config;
@Config.Sources({
  "classpatu:${a}.properties",
  "classpath:config/default.properties",
  "system:properties"
})
public interface DefaultWebConfig extends Config {
  @Key("browser")
  @DefaultValue("chrome")
  String getBrowser();

  @Key("browserVersion")
  @DefaultValue("133")
  String getBrowserVersion();

  @Key("baseUrl")
  String getBaseUrl();

  @Key("remoteUrl")
  @DefaultValue("")
  String gerRemoteUrl();

}
