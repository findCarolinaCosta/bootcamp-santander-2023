package org.dio.desafio.iphone.phone;

/**
 * The `Phone` class represents a basic phone implementation that implements the `Iphone` interface.
 * It allows users to make calls, answer calls, and start voice calls.
 *
 * <p>Usage:
 *
 * <pre>{@code
 * Phone myPhone = new Phone();
 * myPhone.makeCall("123-456-7890");
 * myPhone.answerCall();
 * myPhone.startVoiceCall("987-654-3210");
 * }</pre>
 *
 * @author Carolina Pereira
 * @version 1.0
 * @since 2023-09-07
 */
public class Phone implements Iphone {

  /**
   * Makes a call to the specified phone number.
   *
   * @param number The phone number to call.
   */
  @Override
  public void makeCall(String number) {
    System.out.println("Calling: " + number);
  }

  @Override
  public void anwserCall() {
    System.out.println("Answering call");
  }

  /**
   * Initiates a voice call to the specified phone number.
   *
   * @param number The phone number to call.
   */
  @Override
  public void startVoiceCall(String number) {
    System.out.println("Calling: " + number);
  }
}
