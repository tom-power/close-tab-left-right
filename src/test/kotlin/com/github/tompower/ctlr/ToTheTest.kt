package com.github.tompower.ctlr

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ToTheTest {

    @Test
    fun `smaller ints are to the left of larger ints`() {
        assertFalse(1 toThe Direction.LEFT of 0)
        assertTrue(0 toThe Direction.LEFT of 1)
    }

    @Test
    fun `larger ints are to the right of smaller ints`() {
        assertFalse(0 toThe Direction.RIGHT of 1)
        assertTrue(1 toThe Direction.RIGHT of 0)
    }

    @Test
    fun `equal ints aren't to the right or left or each other`() {
        assertFalse(1 toThe Direction.LEFT of 1)
        assertFalse(1 toThe Direction.RIGHT of 1)
    }
}