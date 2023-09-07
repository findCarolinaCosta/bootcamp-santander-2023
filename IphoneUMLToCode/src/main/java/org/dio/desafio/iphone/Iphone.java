package org.dio.desafio.iphone;

import org.dio.desafio.iphone.browser.InternetBrowser;
import org.dio.desafio.iphone.phone.Phone;
import org.dio.desafio.iphone.player.MusicPlayer;

/**
 * The `Iphone` class represents a simplified model of an iPhone, combining functionalities of a
 * music player, phone, and internet browser. It provides methods to control these features such as
 * playing music, making calls, and browsing the internet.
 *
 * <p>Usage:
 *
 * <pre>{@code
 * Iphone myPhone = new Iphone();
 * myPhone.playMusic();
 * myPhone.makeCall("123-456-7890");
 * myPhone.openBrowser("https://example.com");
 * }</pre>
 *
 * @author Carolina Pereira
 * @version 1.0
 * @since 2023-09-07
 */
public class Iphone {
  private final MusicPlayer musicPlayer = new MusicPlayer();
  private final Phone phone = new Phone();
  private final InternetBrowser internetBrowser = new InternetBrowser();

  void playMusic() {
    musicPlayer.play();
  }

  void pauseMusic() {
    musicPlayer.pause();
  }

  /**
   * Selects and plays a specific music track using the integrated music player.
   *
   * @param songName The name of the song to be played.
   */
  void selectMusic(String songName) {
    musicPlayer.selectMusic(songName);
  }
  /**
   * Makes a call using the integrated phone functionality.
   *
   * @param number The phone number to call.
   */
  void makeCall(String number) {
    phone.makeCall(number);
  }

  void anwserCall() {
    phone.anwserCall();
  }
  /**
   * Initiates a voice call to the specified phone number using the integrated phone functionality.
   *
   * @param number The phone number to call.
   */
  void startVoiceCall(String number) {
    phone.startVoiceCall(number);
  }

  /**
   * Opens the internet browser and displays a web page with the specified URL.
   *
   * @param url The URL of the web page to display.
   */
  void openBrowser(String url) {
    internetBrowser.displayPage(url);
  }

  void openNewTab() {
    internetBrowser.addNewTab();
  }

  void refreshPage() {
    internetBrowser.refreshPage();
  }
}
