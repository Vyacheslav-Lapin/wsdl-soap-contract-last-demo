package ru.ais.courses.java.integration;

import javax.xml.ws.Endpoint;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ServerStarter {

  private final String URL = "http://localhost:1212/hello";

  public void main(String... __) {
    Endpoint.publish(URL, new Hello());
    System.out.printf("Service started @ %s%n", URL);
  }
}
