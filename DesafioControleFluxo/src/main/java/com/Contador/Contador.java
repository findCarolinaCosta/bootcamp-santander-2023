package com.Contador;

import com.ParametrosInvalidosException.ParametrosInvalidosException;
import java.util.Scanner;

/**
 * The `Contador` class performs counting based on two input parameters and handles parameter
 * validation.
 */
public class Contador {
  /**
   * The main method of the `Contador` class, responsible for user input and handling exceptions.
   *
   * @param args The command-line arguments.
   */
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    System.out.println("Digite o primeiro parâmetro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parâmetro");
    int parametroDois = terminal.nextInt();

    try {
      // chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException exception) {
      // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Counts and prints numbers based on the given range of parameters.
   *
   * @param parametroUm The first parameter for counting.
   * @param parametroDois The second parameter for counting.
   * @throws ParametrosInvalidosException If the second parameter is not greater than the first.
   */
  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

    if (parametroUm > parametroDois)
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

    int contagem = parametroDois - parametroUm;
    // realizar o for para imprimir os números com base na variável contagem
    for (int i = 0; i < contagem; i++) {
      System.out.println(i + 1);
    }
  }
}
