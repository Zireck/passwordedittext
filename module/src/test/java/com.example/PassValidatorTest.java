package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by andres.hernandez on 31/05/16.
 */
public class PassValidatorTest {

  private PassValidator passValidator;

  @Before public void prepareSUT() {

  }

  @Test public void shouldValidate() throws Exception {
    passValidator = new PassValidator("Test1");
    boolean result = passValidator.validate();
    assertTrue(result);
  }

  @Test public void shouldNotValidate() throws Exception {
    passValidator = new PassValidator("T e s t");
    boolean result = passValidator.validate();
    assertFalse(result);
  }

  @After public void cleanSUT() {
    passValidator = null;
  }
}