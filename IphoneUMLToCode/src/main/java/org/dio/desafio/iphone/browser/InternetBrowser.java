package org.dio.desafio.iphone.browser;

/**
 * The `InternetBrowser` class represents a basic internet browser implementation that implements
 * the `IBrowser` interface. It allows users to manage and interact with web pages by displaying,
 * adding tabs, and refreshing pages.
 *
 * <p>Usage:
 *
 * <pre>{@code
 * InternetBrowser browser = new InternetBrowser();
 * browser.addNewTab();
 * browser.displayPage("https://example.com");
 * browser.refreshPage();
 * }</pre>
 *
 * @author Carolina Pereira
 * @version 1.0
 * @since 2023-09-07
 */
public class InternetBrowser implements IBrowser {
  private String url;
  /** */
  public String getUrl() {
    return this.url;
  }

  private void setUrl(String url) {
    this.url = url;
  }

  /**
   * Displays a web page with the specified URL and updates the current URL.
   *
   * @param url The URL of the page to be displayed.
   */
  @Override
  public void displayPage(String url) {
    setUrl(url);
    System.out.println("Displaying page: " + getUrl());
  }

  @Override
  public void addNewTab() {
    System.out.println("Adding new tab");
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing page: " + getUrl());
  }
}
