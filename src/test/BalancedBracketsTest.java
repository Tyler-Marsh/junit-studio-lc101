//package BalancedBracketsTest;
//package org.src.test;
//package src.test;
//package test;

import org.junit.Test;

import static org.junit.Assert.*;


// import org.src.main.BalancedBrackets;
public class BalancedBracketsTest {

    //TODO: add tests here
    /*Make ensure environment boot strapped */
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void unmatchingReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestingMatchingCase() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("This[ is [ nest ]]"));
    }

    @Test
    public void nestingNotMatchedCase() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("This [ type of [[ ][]]"));
    }

    @Test
    public void totalEqualsZeroWrongOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }


    @Test
    public void notNull() {
        assertNotNull(BalancedBrackets.hasBalancedBrackets(""));
    }

    /* REGEX to ensure no-starting bracket case comes back false */
    @Test
    public void totalEqualsZero() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }




}
