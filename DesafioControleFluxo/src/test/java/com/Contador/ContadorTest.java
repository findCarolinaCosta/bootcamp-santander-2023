package com.Contador;

import com.ParametrosInvalidosException.ParametrosInvalidosException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/** Test class for the {@link Contador} class. */
public class ContadorTest {
  /**
   * Test case to check the printed output and verify no exception is thrown.
   *
   * @throws ParametrosInvalidosException If invalid parameters are provided.
   */
  @Test
  @DisplayName("Check the printed output, then just check that there was no exception thrown")
  public void testContar() throws ParametrosInvalidosException {
    int parametroUm = 1;
    int parametroDois = 5;

    Contador.contar(parametroUm, parametroDois);
  }
  /** Test case to check the printed message on a thrown exception. */
  @Test
  @DisplayName("Check the printed message on thrown exception")
  public void testContarParametrosInvalidos() {
    int parametroUm = 5;
    int parametroDois = 1;

    ParametrosInvalidosException exception =
        assertThrows(
            ParametrosInvalidosException.class,
            () -> {
              Contador.contar(parametroUm, parametroDois);
            });

    assertEquals("O segundo parâmetro deve ser maior que o primeiro", exception.getMessage());
  }
}
