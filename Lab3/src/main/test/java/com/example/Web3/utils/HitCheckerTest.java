package com.example.Web3.utils;

import junit.framework.TestCase;

public class HitCheckerTest extends TestCase {

    HitChecker hitChecker;
    private final int r = 2;

    protected void setUp() throws Exception {
        hitChecker = new HitChecker();
    }

    public void test1() {
        for (double x = 0; x <= r; x += 0.1) {
            for (double y = (-x * 0.5) + (r / 2); y > 0; y += -0.1) {
                assertTrue(hitChecker.isHit(x, y, r));
            }
        }
    }

    public void test2() {
        for (double x = -r; x <= 0; x += 0.1) {
            for (double y = 0; y <= (r / 2); y += 0.1) {
                assertTrue(hitChecker.isHit(x, y, r));
            }
        }
    }

    public void test3() {
        for (double x = (-r / 2); x <= 0; x += 0.1) {
            for (double y = Math.sqrt((Math.pow(r, 2) / 2) - Math.pow(x, 2)); y <= 0; y += 0.1) {
                assertTrue(hitChecker.isHit(x, y, r));
            }
        }
    }

}