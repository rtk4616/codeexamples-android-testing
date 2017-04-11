package com.example.android.testing.unittesting.BasicSample;

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;


/**
 * Unit tests for the EmailValidator logic.
 */
@SmallTest
public class EmailValidatorTest {


    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("lars.vogel@gmail.com"));
    }

    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
    }

    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
    }

    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
    }
}
