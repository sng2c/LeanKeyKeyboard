package com.gslump.ko_automata;

import org.junit.Test;

import static org.junit.Assert.*;

public class HangulSymbolTest {

    @Test
    public void compose() {
        assertEquals("ㄱ", HangulSymbol.compose("ㄱ", "", ""));
        assertEquals("가", HangulSymbol.compose("ㄱ", "ㅏ", ""));
        assertEquals("과", HangulSymbol.compose("ㄱ", "ㅗㅏ", ""));
        assertEquals("괄", HangulSymbol.compose("ㄱ", "ㅗㅏ", "ㄹ"));
        assertEquals("괅", HangulSymbol.compose("ㄱ", "ㅗㅏ", "ㄹㄱ"));
        assertNull(HangulSymbol.compose("ㄱㅅ", "ㅗㅏ", "ㄹㄱ"));
        assertNull(HangulSymbol.compose("ㄴㅈ", "ㅗㅏ", "ㄹㄱ"));
        assertNull(HangulSymbol.compose("", "ㅗㅏ", "ㄹㄱ"));
        assertNull(HangulSymbol.compose("", "", "ㄹㄱ"));
        assertNull(HangulSymbol.compose("ㄱ", "", "ㄹㄱ"));

    }
}