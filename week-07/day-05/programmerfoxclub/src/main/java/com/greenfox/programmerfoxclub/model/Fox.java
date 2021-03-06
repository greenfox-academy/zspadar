package com.greenfox.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Component
@Setter
public class Fox {
  String name;
  List<String> trickList;
  String food;
  String drink;

  public Fox() {
    this.trickList = new ArrayList<>();
//    trickList.add("photographic memory");
//    trickList.add("fly");
//    trickList.add("can eat unlimited amount of toltottkaposzta");
    this.name = "Mr. Green";
    this.food = "salad";
    this.drink = "water";
//    this.drink = "lemonade";
//    this.food = "pizza";
  }

  public int getTrickListSize() {
    return trickList.size();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void addTrick( String input) {
    trickList.add(input);
  }

}
