import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 12..
 */
public class GameMap {
  public static int[] [] floorMap;
  private List<GameObject> gameObjects;
  private List<GameObject> characterList;


  public List<GameObject> getGameObjects() {


    return gameObjects;
  }

  public List<GameObject> getCharacterList() {
    return characterList;
  }

  public GameMap() {
    this.floorMap = new int[][] {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            {0, 1, 1, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0}
    };

    this.gameObjects = new ArrayList<>();
    this.characterList = new ArrayList<>();
  }

  public int[][] getFloorMap() {
    return floorMap;
  }

  public void fillMap() {
    for (int i = 0; i < 10; i ++) {
      for (int j = 0; j < 10; j ++) {
        if (floorMap[i][j] == 0) {
          gameObjects.add( new Floor(j * 72, i * 72, "assets/floor.png"));
        } else if (floorMap[i][j] == 1) {
          gameObjects.add(new Wall(j* 72, i * 72, "assets/wall.png")) ;
        }
      }
    }
  }

  public boolean isItFloor(int posX, int posY) {
    for (GameObject g : gameObjects) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        GameObject floor = new Floor();
        g.getClass().equals(floor.getClass());
        return true;
      }
    }
    return false;
  }

  public boolean isItCharacter(int posX, int posY) {
    for (GameObject g : characterList) {
      if (g.getPosX() == posX && g.getPosY() == posY) {
        return true;
      }
    }
    return false;
  }


  public boolean anotherisWall(int x, int y) {
    return floorMap[x/72][y/72] == 1;
  }

  public int[] randCoordinate() {
    int[] coordinates = new int[2];
    int X = (int) (Math.random() * 10) * 72;
    int Y = (int) (Math.random() * 10) * 72;
    while (anotherisWall(X,Y) || isItCharacter(X,Y)) {
      X = (int) (Math.random() * 10) * 72;
      Y = (int) (Math.random() * 10) * 72;
    }
    coordinates[0] = X;
    coordinates[1] = Y;
    return coordinates;
  }




}
