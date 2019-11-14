package com.techtorial.Tests.TestNGPractice;

import org.testng.annotations.*;

public class TestNG_Annotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("this will execute before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("this will execute after suite");
    }


    @BeforeTest
    public  void beforeTest() {
        System.out.println("this will execute before test");
    }

    @AfterTest
    public  void afterTest() {
        System.out.println("this will execute after test");
    }

    @Test(priority = 1)
    public void test2(){
        System.out.println("This is test1");
    }

    @Test(priority = 2,alwaysRun = true)
    public void test1(){
        System.out.println("This is test2");
    }

    @Test(priority = 3,enabled = false)  //if it false it will not run ,,if its true it will run
    public void test3(){
        System.out.println("This is test3");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("this is after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }


}
