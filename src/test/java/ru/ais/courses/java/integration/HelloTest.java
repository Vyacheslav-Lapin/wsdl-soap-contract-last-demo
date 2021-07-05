package ru.ais.courses.java.integration;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.ais.courses.integration.ws.client.HelloService;

class HelloTest {

  @Test
  @SneakyThrows
  @DisplayName("WSDL-SOAP Service works correctly")
  void wSDLSOAPServiceWorksCorrectlyTest() {
    assertThat(new HelloService().getHelloPort().hello("Henry")).isNotNull()
        .isEqualTo("Hello, Henry");
  }
}
