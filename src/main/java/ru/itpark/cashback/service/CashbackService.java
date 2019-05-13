package ru.itpark.cashback.service;

import org.springframework.stereotype.Service;

@Service
public class CashbackService {
  public int calculate(int costs) {
    int limit = 3_000;
    int percent = 5;

    int result = costs * percent / 100;
    if (result > limit) {
      return limit;
    }

    return result;
  }
}
