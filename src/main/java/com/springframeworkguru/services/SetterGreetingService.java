package com.springframeworkguru.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello - I was injected by a setter";
  }
}
