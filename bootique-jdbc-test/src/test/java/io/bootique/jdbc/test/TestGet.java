package io.bootique.jdbc.test;

import io.bootique.jdbc.test.matcher.RowCountMatcher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestGet extends BasicTest {

    @Test
    public void testGetString() {
        T1.matcher().eq("c2", "xr").assertNoMatches();
        T1.insert(1, "xr", "yr");
        T1.matcher().eq("c2","xr").assertOneMatch();
    }

    @Test
    public void testGetInt() {
        T1.matcher().eq("c1",56).assertNoMatches();
        T1.insert(56, "xr", "yr");
        T1.matcher().eq("c1",56).assertOneMatch();
    }
}
