/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class GameObject {
  private int posX;
  private int posY;
  private String costume;

  public GameObject(){

  }

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }



  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public String getCostume() {
    return costume;
  }

  public void setCostume(String costume) {
    this.costume = costume;
  }

  public void move(int x, int y) {
    this.posX = posX + x;
    this.posY = posY + y;
  }
}
