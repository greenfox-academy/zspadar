package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.Fox;
import com.greenfox.programmerfoxclub.model.Nutrition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zsuzsanna.padar on 2017. 05. 04..
 */
@Controller
public class MainController {
  @Autowired
  Fox fox;
  Nutrition nutrition;

  @RequestMapping(value = "/")
  public String index(Model model){
    model.addAttribute("fox", fox);
    return "index";
  }

  @RequestMapping(value = "/nutritionStore")
  public String nutritionStore(Model model){
    model.addAttribute("fox", fox);
    model.addAttribute("nutrition", nutrition);
    return "nutritionStore";
  }

}
