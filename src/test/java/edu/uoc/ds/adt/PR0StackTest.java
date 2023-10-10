package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        LocalDate startDate = LocalDate.of(2023,9,28);
        for (int i = 0; i < 10; i++) {
            pr0q.push(startDate.plus(i*2, ChronoUnit.DAYS));
        }
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(10, this.pr0q.getStack().size());

        assertEquals("10/16, 10/14, 10/12, 10/10, 10/08, 10/06, 10/04, 10/02, 09/30, 09/28, ", this.pr0q.clearAllStack());

        assertEquals(0, this.pr0q.getStack().size());
    }
}
