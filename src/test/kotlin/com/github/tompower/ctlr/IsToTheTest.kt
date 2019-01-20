package com.github.tompower.ctlr

import com.github.tompower.ctlr.Direction.LEFT
import com.github.tompower.ctlr.Direction.RIGHT
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class IsToTheTest {

    @Test
    fun `Smaller ints are to the left of larger ints`() {
        assertFalse(1 isToThe LEFT of 0)
        assertTrue(0 isToThe LEFT of 1)
    }

    @Test
    fun `Larger ints are to the right of smaller ints`() {
        assertFalse(0 isToThe RIGHT of 1)
        assertTrue(1 isToThe RIGHT of 0)
    }

    @Test
    fun `Equal ints aren't to the right or left or each other`() {
        assertFalse(1 isToThe LEFT of 1)
        assertFalse(1 isToThe RIGHT of 1)
    }
}