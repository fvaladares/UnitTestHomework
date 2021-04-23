package com.androiddevs.unittesthomework


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `fibonacci input 0 output 0`() {
        assertThat(Homework.fib(0)).isEqualTo(0)
    }

    @Test
    fun `fibonacci input 1 output 1`() {
        assertThat(Homework.fib(1)).isEqualTo(1)
    }

    @Test
    fun `fibonacci input 2 output 1`() {
        assertThat(Homework.fib(2)).isEqualTo(1)
    }

    @Test
    fun `fibonacci input 6 output 8`() {
        assertThat(Homework.fib(6)).isEqualTo(8)
    }


    @Test
    fun `check braces OK`() {
        assertThat(Homework.checkBraces("(a*b)+d")).isTrue()
    }

    @Test
    fun `check braces fail two braces on open`() {
        assertThat(Homework.checkBraces("((a*b)+d")).isFalse()
    }

    @Test
    fun `check braces fail two braces on close`() {
        assertThat(Homework.checkBraces("(a*b)+d)")).isFalse()
    }

    @Test
    fun `check braces pass two braces`() {
        assertThat(Homework.checkBraces("((a*b)+d)")).isTrue()
    }


}