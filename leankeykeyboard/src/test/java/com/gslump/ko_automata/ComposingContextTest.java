package com.gslump.ko_automata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.gslump.ko_automata.KoreanAutomata.ComposingFsm.ComposingStatePrefix.*;
import static org.junit.Assert.*;

public class ComposingContextTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reset() {
        KoreanAutomata.ComposingContext composingContext = new KoreanAutomata.ComposingContext();
        assertEquals(KoreanAutomata.ComposingFsm.ComposingStatePrefix.INIT, composingContext.getStatePrefix());
        composingContext.setStatePrefix(FIRST);
        composingContext.reset();
        assertEquals(KoreanAutomata.ComposingFsm.ComposingStatePrefix.INIT, composingContext.getStatePrefix());
        assertNull(composingContext.compose());
    }

    @Test
    public void compose() {
        KoreanAutomata.ComposingContext composingContext = new KoreanAutomata.ComposingContext();
        composingContext.set(FIRST, "ㄱ");
        composingContext.set(MIDDLE1, "ㅗ");
        composingContext.set(MIDDLE2, "ㅏ");
        composingContext.set(LAST1, "ㄹ");
        composingContext.set(LAST2, "ㄱ");
        assertNull(composingContext.compose());

        composingContext.setStatePrefix(FIRST);
        assertEquals("ㄱ", composingContext.compose());

        composingContext.setStatePrefix(MIDDLE1);
        assertEquals("고", composingContext.compose());

        composingContext.setStatePrefix(MIDDLE2);
        assertEquals("과", composingContext.compose());

        composingContext.setStatePrefix(LAST1);
        assertEquals("괄", composingContext.compose());

        composingContext.setStatePrefix(LAST2);
        assertEquals("괅", composingContext.compose());

        composingContext.setStatePrefix(SINGLE_MIDDLE1);
        assertEquals("ㅗ", composingContext.compose());

        composingContext.setStatePrefix(SINGLE_MIDDLE2);
        assertEquals("ㅘ", composingContext.compose());
    }

}