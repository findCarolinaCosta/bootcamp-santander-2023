package com.ContaBanco.ContaTerminal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

/** This class provides a simple terminal interface for creating a bank account. */
public class ContaTerminal {

  /**
   * The main method of the application, responsible for interacting with the user and creating a
   * bank account.
   *
   * @param args The command line arguments (unused).
   * @throws IOException If an I/O error occurs while interacting with the user.
   */
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    String account = getUserPrompt("Por favor, digite o número da Conta: ", scanner::next);
    String agency = getUserPrompt("Por favor, digite o número da Agência: ", scanner::next);
    scanner.nextLine();
    String name = getUserPrompt("Por favor, digite o seu nome: ", scanner::nextLine);
    String balance = getUserPrompt("Por favor, digite o valor para depósito: ", scanner::next);

    System.out.println(
        "Olá "
            + name
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agency
            + ", conta "
            + account
            + " e seu saldo "
            + balance
            + " já está disponível para saque");

    scanner.close();
  }

  /**
   * Retrieves user input using a provided prompt and input method.
   *
   * @param prompt      The prompt to display to the user.
   * @param inputMethod The method to use for getting user input.
   * @return The user's input as a String.
   */

  private static String getUserPrompt(String prompt, @NotNull Supplier<String> inputMethod) {
    System.out.println(prompt);
    return inputMethod.get();
  }
}
