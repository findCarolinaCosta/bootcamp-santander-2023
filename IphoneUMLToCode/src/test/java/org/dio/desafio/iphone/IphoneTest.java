package org.dio.desafio.iphone;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/** Unit tests for the Iphone class. */
public class IphoneTest {

  /**
   * A ByteArrayOutputStream is a special OutputStream that can be used to write bytes to a byte
   * array. The bytes are then stored in a byte array buffer.
   */
  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

  /** The original standard output stream. */
  private final PrintStream originalOut = System.out;
  /** The Iphone instance to be tested. */
  private Iphone iphone;

  @BeforeAll
  public static void init() {
    // Redict the standard output to our custom stream
    System.setOut(new PrintStream(new ByteArrayOutputStream()));
  }

  @AfterAll
  public static void cleanup() {
    // Restores the standard output
    System.setOut(System.out);
  }

  @BeforeEach
  public void setUp() {
    iphone = new Iphone();
    // Redirects the output to our custom stream
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  public void tearDown() {
    // Restores the standard output after each test
    System.setOut(originalOut);
  }

  @Test
  @DisplayName("Testa se o método makeCall(String) imprime a mensagem Calling: <number>")
  public void testMakeCall() {
    String number = "123456789";
    iphone.makeCall(number);
    String expectedOutput = "Calling: " + number + "\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método anwserCall() imprime a mensagem Answering call")
  public void testAnswerCall() {
    iphone.anwserCall();
    String expectedOutput = "Answering call\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método startVoiceCall(String) imprime a mensagem Calling: <number>")
  public void testStartVoiceCall() {
    String number = "123456789";
    iphone.startVoiceCall(number);
    String expectedOutput = "Calling: " + number + "\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método playMusic() imprime a mensagem Playing music")
  public void testPlayMusic() {
    iphone.playMusic();
    String expectedOutput = "Playing music\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método pauseMusic() imprime a mensagem Pausing music")
  public void testPauseMusic() {
    iphone.pauseMusic();
    String expectedOutput = "Pausing music\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método selectMusic(String) imprime a mensagem Playing music: <songName>")
  public void testSelectMusic() {
    String songName = "Song Name";
    iphone.selectMusic(songName);
    String expectedOutput = "Playing music: " + songName + "\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método openBrowser(String) imprime a mensagem Displaying page: <url>")
  public void testOpenBrowser() {
    String url = "https://www.google.com";
    openBrowser(url);
    String expectedOutput = "Displaying page: " + url + "\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método openNewTab() imprime a mensagem Adding new tab")
  public void testOpenNewTab() {
    iphone.openNewTab();
    String expectedOutput = "Adding new tab\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  @DisplayName("Testa se o método refreshPage() imprime a mensagem Refreshing page: <url>")
  public void testRefreshPage() {
    String url = "https://www.google.com/serach?q=iphone";
    openBrowser(url);
    outputStream.reset();
    iphone.refreshPage();
    String expectedOutput = "Refreshing page: " + url + "\n";
    assertEquals(expectedOutput, outputStream.toString());
  }

  /**
   * Helper method to open a browser page.
   *
   * @param url the url to be displayed
   */
  private void openBrowser(String url) {
    iphone.openBrowser(url);
  }
}
