package com.selenium.interviewquestion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

     // How to run failed testcase
     //  using testng-failed.xml
     //  using IRetryAnalyser having a boolean method retry
     //  using IAnnotationTransformer and IRetryAnalyzer having method transform

    @Test
    public void testcase1(){
        Assert.assertEquals(true,false);
    }
    @Test
    public void testCase2(){
        Assert.assertEquals(true,false);
    }
}
