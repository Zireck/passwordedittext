package com.example;

public class PassValidator implements Validator<String> {

  private final String textToValidate;

  public PassValidator(String textToValidate) {
    this.textToValidate = textToValidate;
  }

  @Override public boolean validate() {
    return isValid(textToValidate);
  }

  private boolean isValid(String textToValidate) {
    return !textToValidate.contains(" ");
  }
}
