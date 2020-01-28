package com.github.alexandrenavarro.junit5sample;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

public class ResultAnalyzer extends SummaryGeneratingListener {

    public void testPlanExecutionFinished(TestPlan testPlan) {
        //This method is invoked after all tests in all containers is finished
        super.testPlanExecutionFinished(testPlan);
        this.getSummary()
    }


}
