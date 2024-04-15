package com.selenium.interviewquestion;

import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

    @Test
    public void assertTest(){
        System.out.println("Before Assertion");
        Assert.assertEquals(true,false);
        System.out.println("After Assertion");
        Assert.assertEquals(true,true);
    }

    @Test
    public void testVerify(){
        //soft Assertion
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Before Assertion");
        softAssert.fail();
        System.out.println("After Assertion");


    }
}
