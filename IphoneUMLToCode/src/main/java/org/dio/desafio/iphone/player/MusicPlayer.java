package org.dio.desafio.iphone.player;

/**
 * The `MusicPlayer` class represents a simple music player that implements the `IMusic` interface.
 * It allows users to play, pause, and select music tracks.
 *
 * <p>Usage:
 *
 * <pre>{@code
 * MusicPlayer player = new MusicPlayer();
 * player.play();
 * player.pause();
 * player.selectMusic("Song Title");
 * }</pre>
 *
 * @author Carolina Pereira
 * @version 1.0
 * @since 2023-09-07
 */
public class MusicPlayer implements IMusic {
  @Override
  public void play() {
    System.out.println("Playing music");
  }

  @Override
  public void pause() {
    System.out.println("Pausing music");
  }

  /**
   * Selects and plays a specific music track.
   *
   * @param songName The name of the song to be played.
   */
  @Override
  public void selectMusic(String songName) {
    System.out.println("Playing music: " + songName);
  }
}
