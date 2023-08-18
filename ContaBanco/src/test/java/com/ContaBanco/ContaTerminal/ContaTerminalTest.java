package com.ContaBanco.ContaTerminal;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** This class contains test cases for the {@link ContaTerminal} class. */
public class ContaTerminalTest {
  /**
   * Test if the final message is returned as expected.
   *
   * @throws IOException If an I/O error occurs during the test.
   */
  @Test
  @DisplayName("1 - Testa se retorna a mensagem final de acordo com o esperado")
  public void testContaTerminalOutput() throws IOException {
    String input = """
        1021
        067-8
        MARIO ANDRADE
        237.48""";

    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outContent));

    ContaTerminal.main(new String[0]);

    System.setOut(originalOut);

    String expectedOutput2 =
        "Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque";

    List<String> outputLines = List.of(outContent.toString().split("\n"));

    String outContentLastLine = outputLines.stream().reduce((first, second) -> second).orElse("");

    assertEquals(expectedOutput2, outContentLastLine, "A messagem não é corresponde ao esperado");
  }
}
