package com.springframeworkguru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello - I was implemented by a constructor";
  }
}
