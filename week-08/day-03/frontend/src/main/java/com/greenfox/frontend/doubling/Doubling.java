package com.greenfox.frontend.doubling;

/**
 * Created by zsuzsanna.padar on 2017. 05. 10..
 */
public class Doubling {
  int received;
  int result;

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public int getReceived() {
    return received;
  }
  public int getResult() {
    return result;
  }



}
