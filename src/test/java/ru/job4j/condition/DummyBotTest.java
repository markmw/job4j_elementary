package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Почему ты такой тупой?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}