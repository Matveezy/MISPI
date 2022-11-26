package com.example.Web3.utils;

import com.example.Web3.entity.Result;
import com.example.Web3.entity.Result;
import junit.framework.TestCase;

public class ValidatorTest extends TestCase {

    public Validator validator;
    public Result consequence;

    public void setUp() throws Exception {
        validator = new Validator();
        consequence = new Result();
    }

    public void test1() {
        consequence.setX(2F);
        consequence.setY(2F);
        consequence.setR(2);
        assertTrue(validator.validate(consequence));
    }

    public void test2() {
        consequence.setX(8F);
        consequence.setY(2F);
        consequence.setR(2);
        assertFalse(validator.validate(consequence));
    }

    public void test3() {
        consequence.setX(2F);
        consequence.setY(2F);
        consequence.setR(8);
        assertFalse(validator.validate(consequence));
    }

    public void test4() {
        consequence.setX(2F);
        consequence.setY(3.0001F);
        consequence.setR(8);
        assertFalse(validator.validate(consequence));
    }
}