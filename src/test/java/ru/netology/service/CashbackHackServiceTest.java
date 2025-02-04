package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldBeRemain0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeRemain900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBeRemain300() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(700);
        int expected = 300;
        assertEquals(actual,expected);
    }
}