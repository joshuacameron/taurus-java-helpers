package com.blazemeter.taurus.junit;

import com.blazemeter.taurus.junit.reporting.Sample;

import java.util.Properties;

public class TestJUnitRunner implements JUnitRunner {
    @Override
    public Object createRequest(Properties props) {
        return null;
    }

    @Override
    public void executeRequest(Object requestItem, Reporter reporter, ThreadCounter counter) {
        Sample sample = new Sample();
        sample.setLabel("aaaa");
        sample.setActiveThreads(counter.getActiveThreads());
        reporter.writeSample(sample);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
