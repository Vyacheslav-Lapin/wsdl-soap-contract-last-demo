package ru.ais.courses.java.integration;

import static javax.jws.soap.SOAPBinding.Style.RPC;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@WebService
@SOAPBinding(style = RPC)
public class Hello {

  @Contract(pure = true)
  public @NotNull String hello(@NotNull String name) {
    return "Hello, %s".formatted(name);
  }
}
