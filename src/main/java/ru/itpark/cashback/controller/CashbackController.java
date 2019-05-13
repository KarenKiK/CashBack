package ru.itpark.cashback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.cashback.service.CashbackService;

@Controller
public class CashbackController {
  private CashbackService service;

  public CashbackController(CashbackService service) {
    this.service = service;
  }

  // mapping
  @RequestMapping
  public String index() {
    return "index";
  }

  @RequestMapping(params = {"costs"}) // должен соответствовать атрибуту name в input
  public String calculate(
      Model model,
      @RequestParam int costs // должно соответствовать атрибуту name в input
  ) {
    int result = service.calculate(costs);
    model.addAttribute("result", result);
    return "index";
  }

}
