package com.greenfox.tennis;

/**
 * Created by zsuzsanna.padar on 2017. 05. 22..
 */
public class TennisGame1 implements TennisGame {

  private int mScore1 = 0;
  private int mScore2 = 0;


  public TennisGame1(String player1Name, String player2Name) {
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      mScore1 += 1;
    } else {
      mScore2 += 1;
    }
  }

  public String getScore() {
    String score = "";
    int tempScore;
    if (mScore1 == mScore2) {
      switch (mScore1) {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    } else if (mScore1 >= 4 || mScore2 >= 4) {
      int minusResult = mScore1 - mScore2;
      if (minusResult == 1) {
        score ="Advantage player1";
      } else if (minusResult == -1) {
        score ="Advantage player2";
      } else if (minusResult >= 2) {
        score = "Win for player1";
      } else {
        score ="Win for player2";
      }
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) {
          tempScore = mScore1;
        } else {
          score+= "-";
          tempScore = mScore2;
        }
        switch(tempScore) {
          case 0:
            score+= "Love";
            break;
          case 1:
            score+= "Fifteen";
            break;
          case 2:
            score+= "Thirty";
            break;
          case 3:
            score+= "Forty";
            break;
        }
      }
    }
    return score;
  }
}
