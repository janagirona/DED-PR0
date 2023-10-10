package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;


    private void fillQueue() {
        LocalDate startDate = LocalDate.of(2023,9,28);
        for (int i = 0; i < 10; i++) {
            pr0q.add(startDate.plus(i*2, ChronoUnit.DAYS));

        }
    }
    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(10, this.pr0q.getQueue().size());

        assertEquals("09/28, 09/30, 10/02, 10/04, 10/06, 10/08, 10/10, 10/12, 10/14, 10/16, ", this.pr0q.clearFullQueue());

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
