package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JobTests {
    Job job1;
    Job job2;

    @Before
    public void createJobObject(){
        Job job1 = new Job();
        Job job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(job2.getId(), job1.getId() + 1 );
    }

    @Test
    public void name() {
    }
}
