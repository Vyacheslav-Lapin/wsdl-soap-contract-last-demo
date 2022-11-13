package ru.ais.courses.java.integration;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static javax.jws.soap.SOAPBinding.Style.*;

@WebService
@SOAPBinding(style = RPC)
public class Hello {

  @Contract(pure = true)
  @SuppressWarnings("unused")
  public @NotNull String hello(@NotNull String name) {
    return "Hello, %s".formatted(name);
  }
}
